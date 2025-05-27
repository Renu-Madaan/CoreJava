package CoreJavaPackage;

public class RunTimeMainClass {

	public static void main(String[] args) {
//		SingleInheritence1 s1 = new SingleInheritence1();
//		s1.speak();
//		s1.read();
//		s1.write();
//		s1.read();
//		
//		
//		// Calling static method using the class name
//		// static methods cannot be over-ride 
//		SingleInheritence.displayMessage();
//
////		 //abstraction
//		AbstractionVehicle1 v1 = new AbstractionVehicle1();// creating object AbstractionVehicle1
//		v1.tyre(23);
//		v1.brandname("Yaris", 908);
//		v1.seat();
//		v1.speed();
//		v1.display();
//		
//		
//		AbstractionVehicle2 v2 = new AbstractionVehicle2();// creating object AbstractionVehicle1
//		v2.tyre(24);
//		v2.brandname("mercedes", 908);
//		v2.seat();
//		v2.speed();
//		v2.display1();
		
		AbstractionVehicle av = new AbstractionVehicle1();
		AbstractionVehicle av1 = new AbstractionVehicle2();
//		A superclass cannot directly create a reference to a subclass.
//		But a superclass reference can point to a subclass object.
//
//		This is a key feature of polymorphism in object-oriented programming — 
//		where a superclass reference is used to refer to any of its subclass objects.

		av.tyre(23);
		av.brandname("yaris", 5432);
		av.seat();
		av.speed();
		 //AbstractionVehicle2 

		av1.tyre(24);
		av1.brandname("mercedes", 9876);
		av1.seat();
		av1.speed();
		av1.colour();
		//
		
		

			    // create an object of the subclass
			    Dog labrador = new Dog();

			    // access field of superclass
			    labrador.name = "Rohu";
			    labrador.display();

			    // call method of superclass
			    // using object of subclass
			    labrador.eat();
			    
			    // Polymorphism Practice 
			    Poly1 p1 = new Poly1();
			    p1.sum(2, 3);
			    p1.sum(1, 23, 80);
			    
			    //Java provides a default constructor if you don't define any.
			    	 DefaultConstructor myCar = new  DefaultConstructor();  // Constructor is called here
			    }
			
			    
			    
	

			  }
		
		
		
		



