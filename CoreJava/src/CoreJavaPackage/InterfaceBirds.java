package CoreJavaPackage;

public interface InterfaceBirds extends InterfaceAnimal
{
	void beak();
	void feather();
}
// interface extends interface.
// class extends class
//class implements interface 
//Abstract Class: A class can extend only one abstract (or any) class due to single inheritance.
//Interface: A class can implement multiple interfaces, allowing multiple inheritance of type.
//abstract Class: Can have constructors, fields (state), and access modifiers (private/protected).
//Interface: Can't have constructors. Typically contains constants and public static final fields only.
