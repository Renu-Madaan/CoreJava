package CoreJavaPackage;

public class InterfaceTestClass implements InterfaceAnimal, InterfaceBirds {

	public void bark() {
		System.out.println(" Animal Interface1");
	}

	public void legs() {
		System.out.println("Animal Interface");
	}

	public void sound() {
		System.out.println(" Animal Interface");
	}

	public void beak() {
		System.out.println(" Bird Interface");
	}

	public void feather() {
		System.out.println(" Bird Interface ");
	}

	public static void main(String[] args) {
		InterfaceTestClass ia = new InterfaceTestClass();// interface1
		ia.bark();
		ia.legs();
		ia.sound();
		// interface2
		ia.beak();
		ia.feather();
		

	}
}
