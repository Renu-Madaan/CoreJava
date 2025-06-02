package CoreJavaPackage;

public class InterfaceAnimalTestClass implements  InterfaceBirds{

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
		System.out.println(" This method from BirdsInterface");
		
	}

	
	public void feather() {
		System.out.println("This method from Birds Interface ");
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		InterfaceAnimalTestClass ia = new InterfaceAnimalTestClass();// interface1
		ia.bark();
		ia.legs();
		ia.sound();
		
		

	}

	
}
