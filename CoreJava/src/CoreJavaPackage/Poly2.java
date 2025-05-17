package CoreJavaPackage;// runtime- late-binding -dynamic

public class Poly2 extends Poly1 {

	@Override
	public Integer sum(int a, int b) {
		int c = a + b;
		System.out.println(" The value of override method  is:- " + c);

		return c;
	}
	
	public void display()
	{
		System.out.println(" Run-time poly/dynamic");
	}
	
public static void main(String[] args) {
	Poly1 p1 = new Poly2();
	p1.sum(2,3);
	p1.sum(1, 20,30);
	
}
}
