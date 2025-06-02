package CoreJavaPackage;

public class ThisKeyword4 {
	
//this keyword is used to call the default constructor of the same class.
	ThisKeyword4()// instance variable 
	{
		System.out.println("This is default constructor ");
	}	
		
		ThisKeyword4(int thiskeyword)//local variable 
		{

			this();// this keyword is  called defualt contructor if you place this() in parameterised constructor ..
		System.out.println("This is local variable ");	
			
			
		}
public static void main(String[] args) {

	ThisKeyword4 t4 = new ThisKeyword4();
}

}