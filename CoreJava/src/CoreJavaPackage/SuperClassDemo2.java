package CoreJavaPackage;


public class SuperClassDemo2 extends SuperClassDemo {

	
	    void start() {
	        System.out.println("Car is starting...");
	    }
	    
	    void playMusic() {
	        System.out.println("Playing music...");
	    }
	
//		A superclass cannot directly create a reference to a subclass.
//		But a superclass reference can point to a subclass object.
//
//		This is a key feature of polymorphism in object-oriented programming — 
//		where a superclass reference is used to refer to any of its subclass objects.
	 
	    public static void main(String[] args) {
	        SuperClassDemo v = new SuperClassDemo2();  // Superclass reference to subclass object
	        v.start();              // Calls overridden method in Car

	         //v.playMusic();      // ❌ Error: playMusic() not in SuperClassDemo which is a super/parent class
	    }
}