package CoreJavaPackage;

public class ThrowKeyword {

	public static void main(String[] args) {
	int a=10; int b=2,c;
	c=a/b;
System.out.println(c);
// exception object creation
		throw new ArithmeticException("/by zero");
//                 //User-defined exception

	}

}
//Throwable is the base class for all exceptions and errors in Java. 
// Throw keyword is used to throw the user- defined or customized exception object the JVM Explicitly .
//throws is used to declare that a method might throw a specific exception