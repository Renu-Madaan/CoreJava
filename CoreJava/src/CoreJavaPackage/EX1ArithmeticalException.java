package CoreJavaPackage;

public class EX1ArithmeticalException {

	public static void main(String[] args) {
	
		        int numerator = 10;
		        int denominator = 2;
		        
		        try {
		            int result = numerator / denominator;
		            System.out.println("Result: " + result); // This line will not be reached
		        } catch (ArithmeticException e) {
		            System.err.println("Error: Division by zero is not allowed.");
		            System.err.println("Exception details: " + e.getMessage());
		        }
		        
		        System.out.println("Program continues after exception handling.");
		    }
		

	}
//An arithmetic exception in java is a Runtime exception present in the java.lang package. 
//JVM throws Arithmetic Exception when a wrong mathematical expression

