package CoreJavaPackage;

class AbstractionVehicle1 extends AbstractionVehicle{
	 AbstractionVehicle1()
	 {
		super();
		System.out.println("AbstractionVehicle1");
		System.out.println("super keyword refers to superclass (parent) objects");
	}

	void display()
	{
		System.out.println(" this is ford yaris  feature");
	}
	 
	public void tyre(int size) {
		System.out.println(" There is differnet types of size" + size);// abstract method
	}
	 
	public void brandname(String name, int modelNumber) {
		System.out.println(" Every vehicle has its own brandname:-" + name + "   "+   "modelNumber" + modelNumber);// abstract
																											// method
	}
	 
		public void seat() {
			System.out.println("seat material is made of leather");
				
		}
		 
		 public void speed()
		 {
			 System.out.println("Speed");
		 }
			
	 
	 

}
