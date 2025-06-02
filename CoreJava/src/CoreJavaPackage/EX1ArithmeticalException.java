package CoreJavaPackage;

public class EX1ArithmeticalException {

	public static void main(String[] args) {
	
		        int numerator = 0;
		        int denominator = 0;
		        
		        try {
		            int result = numerator / denominator;
		            System.out.println("Result: " + result); // This line will not be reached
		            System.out.println(" This is try block");
		        } 
//		            catch (ArithmeticException e) {
//		        	e.printStackTrace();
//		        	 System.out.println(" This is catch block");
//		            //System.err.println("Error: Division by zero is not allowed.");
//		            //System.err.println("Exception details: " + e.getMessage());
//		        }
		        	 
		        	 catch (Exception e) {
				        	e.printStackTrace();// exception method 
				        	 System.out.println(" This is catch2 block");
				            //System.err.println("Error: Division by zero is not allowed.");
				            //System.err.println("Exception details: " + e.getMessage());
		        	 
		        	 
		        	 
		        	 
		        	 
		        }
		        finally
		        {
		        
		        System.out.println("Program continues after exception handling/ we are inside the finaly block.");
		        
		        //observe that the print statement inside the finally block got executed, even after the exception is not thrown
		        
		    }
		

	}}
//An arithmetic exception in java is a Runtime exception present in the java.lang package. 
//JVM throws Arithmetic Exception when a wrong mathematical expression

//in  try catch block, catch is used for exception handling 
//The code inside the Finally Block  always executed  whether exception occurs or not 
// Finally is a block which is always executed either after try or catch. Fianlly cannot be multiple in single try catch block ..
// In Try-catch block, there is a single try and single finally block but catch can be multiple. 
//It is placed after try and catch block
//The code inside the Finally Block  always executed under following circumstances 
//1.After the try block finishes successfully.
//2After an exception is caught in the catch block.
//3Even if an exception is not caught and the program terminates.




