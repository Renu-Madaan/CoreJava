package CoreJavaPackage;// this keyword is also called parameterised constructor of its own class .

public class ThisKeyword2 {

	ThisKeyword2()// instance variable 
	{
		this(100);
		System.out.println("This is default constructor ");
	}	
		
		ThisKeyword2(int thiskeyword)//local variable 
		{

			//this();
		System.out.println("This is local variable "+thiskeyword);	
			
			
		}
public static void main(String[] args) {

	ThisKeyword2 t2 = new ThisKeyword2(100);
}

}
