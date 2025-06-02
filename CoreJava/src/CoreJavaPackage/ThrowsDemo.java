package CoreJavaPackage;

public class ThrowsDemo {

	static void checkAge(int age) throws ArithmeticException {
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}

	public static void main(String[] args) {
		checkAge(15); // Set age to 15 (which is below 18...)

	}
}
//throws goes in the method signature.

//It warns the caller: “This method might throw this exception. You must deal with it!”

//Typically used for checked exceptions like IOException, SQLException, etc.