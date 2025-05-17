package CoreJavaPackage;

public class Poly1 {
	public Integer sum(int a, int b) { // order/type//
		int c = a + b;
		System.out.println(" The value of c is:- " + c);

		return c;
	}

	public void sum(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("The sum of a,b,c:-" + "    " + d);
		//return d;

	}

}

//Method overloading ( when two same name method with different parameter in same class)
//but with different parameter lists (method type, sequence of parameter, body/logic).