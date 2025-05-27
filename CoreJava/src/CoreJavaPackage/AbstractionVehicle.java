package CoreJavaPackage;

abstract class AbstractionVehicle {
	AbstractionVehicle() {
		System.out.println(" This is default constructor , can see in both classes");
	}
	

	public abstract void tyre(int size);

	public abstract void brandname(String name, int modelNumber);

	public abstract void seat();

	public abstract void speed();

	public void colour() {
		System.out.println(" This is concreate method");
	}

}
//Abstaction is a process or mecahnism where we hide irrrelevent information(implementation)
//and show relevent information to the user and which is achieved by abstract classes and interfaces .
// we use abstract keyword while declaring class called abstract class.
// It  contains abstract method and concrete method/non-abstract methods..
//Abstract Method can create only in abstract class .
//abstract class extends by sub class

// we cannot insensiate  abstract class or interface(Similarity)
//we use abstract  for code optimaization or security and enhancement .******
// Both abstract and interfaces are public (similarity)
// if a class contain partial implementation then we should declare  that class abstract class.******
// ****** 
//differences
//In interface ,  we use interface keyword while declaring interface.
//All methods will have signature only, cannot have body.
//interface can be extended by sub classe where in  sub class needs to define all method of interfaces .
// Multiple inherience is achieved by Interface .
