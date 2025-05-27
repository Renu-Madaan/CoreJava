package CoreJavaPackage;

public class StaticMethodPractice1 {

	// We can create static variables/global variables at the class level only.
	// belongs to the class, use static methods or variables without creating an object.
	// static block and static variables are executed in the order they are present
	// in a program
	// Static methods and static variables can also create into non-static classes

		// static variable
	static int a = m1();

	// static block
	static {
		System.out.println("Inside static block");
	}

	// static method
	static int m1() {
		System.out.println("from m1");
		return 20;
	}

	public static void main(String[] args) {
		System.out.println("Value of a : " + a);
		System.out.println("from main");

		
		
	}

	
}
