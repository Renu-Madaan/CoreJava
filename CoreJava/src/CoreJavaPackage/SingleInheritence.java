package CoreJavaPackage;

public class SingleInheritence
//In single inheritance, a single subclass extends from a single superclass
{
	// Always remember Method defined at class level (outside main method)
	public void read() {
		System.out.println("This is read method");
	}

	public void speak() {
		System.out.println("This is speak method");
	}

	// Static method
	public static void displayMessage() {
		System.out.println("Hello from a static method!");
	}
	// Calling static method using class name
//A static method in Java is a method that belongs to the class, not to instances (objects) of the class.


}

//Single inheritance is a fundamental concept in object-oriented programming where a class
//(the derived or child class) inherits properties and behaviors from a single parent class (the base or superclass).
//This is the most basic form of inheritance and allows for code reusability and modular design. 