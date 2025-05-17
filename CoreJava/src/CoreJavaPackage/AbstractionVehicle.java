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

//A class which contain abstract keyword in its declaration is called abstract method.
// It may or may not contain abstract method .
//It can have abstract methods and nonabstract methods.
//To use the abstract class, you have to inherit it from the sub class
//Abstaction is a process or mecahnism where we hide irrrelevent information(implementation) and show relevent information
//(highlight set of services)by using abstarct keyword
// we cannot insensiate  abstract class or interface(Similarity)
//we use abstract  for code optimaization or security and enhancement .

// Both abstract and interfaces are public (similarity)
// if a class contain partial implementation then we should declare  that class abstract class.