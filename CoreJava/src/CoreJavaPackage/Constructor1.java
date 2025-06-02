package CoreJavaPackage;

public class Constructor1 {// class name default constructor name should be same 
	int a; String b; boolean c;
	Constructor1()
	{
//		a=123;b="Tamanna";c=true;
		
		//System.out.println(" This is default constructor");
	}
	void display()
	{
		System.out.println("a" +"  "+ a +"   "+ "b"+"   " +b + "   "+"c"+"  "+c);
	}
	
	

}
// Constructor is a special type of method which has same name as class name and its return type is void .
// constructors are declared public so that objects of the class can be created from outside 
// constructors can also be declared protected or private to restrict object creation.
// ?? cons public/private/ static parameterized cons // how we use parameterized cons in bdd.