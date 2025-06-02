package CoreJavaPackage;

public class InterfaceBirdTestClass implements InterfaceBirds 


{
	public void bark() {
		System.out.println(" Animal Interface1");
	}

	public void legs() {
		System.out.println("Animal Interface");
	}

	public void sound() {
		System.out.println(" Animal Interface");
	}
	
	public void beak() {
		System.out.println(" Bird Interface");
	}

	public void feather() {
		System.out.println(" Bird Interface ");
	}
	public static void main(String[] args) {
		
	
	
	InterfaceBirdTestClass b1 = new InterfaceBirdTestClass();
	b1.beak();
	b1.feather();
	
	
	
	
	}}

