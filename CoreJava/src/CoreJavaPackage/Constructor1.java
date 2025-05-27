package CoreJavaPackage;

public class Constructor1 {// class name default constructor name should be same 
	
	Constructor1()
	{
		System.out.println(" This is default constructor");
	}
	
	public static void main(String[] args) {
		Constructor1 c1 = new Constructor1();// no need to create constructor

	}

}
// Constructor is a special type of method which has same name as class name and its return type is void .
// ?? cons public/private/ static parameterized cons // how we use parameterized cons in bdd.