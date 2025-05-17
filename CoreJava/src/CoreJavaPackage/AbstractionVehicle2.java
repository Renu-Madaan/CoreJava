package CoreJavaPackage;

class AbstractionVehicle2 extends AbstractionVehicle {
	AbstractionVehicle2() {
		super();
		System.out.println("AbstractionVehicle2");
	}

	void display1()// concreate method
	{
		System.out.println(" this is marcedes feature");
	}

	public void tyre(int size) {
		System.out.println(" There is differnet types of size" + size);// abstract method
	}

	public void brandname(String name, int modelNumber) {
		System.out.println(" Every vehicle has its own brandname " + "  " + name);// abstract method
	}

	public void seat() {
		System.out.println("seat material is made of leather");

	}

	public void speed() {
		System.out.println("Speed");
	}

}
