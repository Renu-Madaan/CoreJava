package CoreJavaPackage;

class Constructor3 {
	
	Constructor3()
	{
		//this(12);
		System.out.println("this is default constrctor");
	}
	
	
	
	// Parameterized constructor 
	public Constructor3(int a) {
		
		//this();
		System.out.println(a+8);
		
	}
	
	public static void main(String[] args) {
		Constructor3 c3 = new Constructor3();
	}
	
	
	
	
	
	

}
