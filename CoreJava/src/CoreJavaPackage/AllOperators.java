package CoreJavaPackage;

public class AllOperators {

	public static void main(String[] args) {
		//Operators are used to perform operations on variables and values.
		int a=10; int b=5;
		// Addition 
		int addition =a+b;
		//Subtraction 
		int diff=a-b;
		// Multiplication 
		int product= a*b;
		// division
		int quotient =a/b;
		// Modulus
		int remainder =a%b;
		
		
		
		System.out.println(addition);
		System.out.println(++addition);// prefix//	Increases the value of a variable by 1
		System.out.println(addition++);//Postfix
		
		System.out.println(diff);
		System.out.println(--diff);//	Decreases the value of a variable by 1
		System.out.println(diff--);
		System.out.println(product);
		System.out.println(quotient);
		System.out.println(remainder);
		
		

	}

}
