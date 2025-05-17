package CoreJavaPackage;

public class MultiLevelInhetitence1 extends SingleInheritence1 {
	public void listen() {
		System.out.println("This is listen ");

	}

}// A class can inherit from multiple parent classes

//In multilevel inheritance, a subclass extends from a superclass and then the same subclass 
//acts as a superclass for another class.

//In multiple inheritance-java doesnot support multiple inheritence
//where a class can inherit properties of more than one parent class 

// single subclass extends from multiple superclasses.
//Java doesn't support multiple inheritance. However, we can achieve multiple inheritance using interfaces
//hybrid inheritance is a combination of two or more types of inheritance