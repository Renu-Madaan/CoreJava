package CoreJavaPackage;

public class FinalKeyword {
	// Main driver method
	public static void main(String[] args) {
		// Java program to demonstrate
		// local final variable

		// Declaring local final variable
		final int i;

		// Now initializing it with integer value
		i = 20;
		// we cannot perform re-assignment.
		//i=30;

		// Printing the value on console
		System.out.println(i);
	}

}
// Do we have multiple catch block in try catch block //yES 
// final keyword can be used with variable,method and class
// Final class cannot be a parent of any  class.i Mean it can not be inherited .
//** During compilation it restricts inheritence and reassignment
//when a method a final that cannot be override
//when a variable is final that cannot be changed during execution.
// if exception does not come , then catch would not used.
// we use finally in try catch block. there is a single finally block in try catch block and finally block always excute
// In finally block we write the code to release used resources example close database connection and any file.
// fianlize is a method called by garbage colletor(Before object deletion) which is used for release the momery.