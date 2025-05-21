package CoreJavaPackage;

public class ParameterizedConstructor {
	
	    String brand;
	    int modelYear;

	    // Parameterized constructor
	    ParameterizedConstructor(String brand, int year) {
	        this.brand = brand;
	        this.modelYear = year;
	    }

	    public void display() {
	        System.out.println("Brand: " + brand + ", Year: " + modelYear);
	    }

	    public static void main(String[] args) {
	    	ParameterizedConstructor myCar = new ParameterizedConstructor("Toyota", 2023);
	        myCar.display();
	    }
	}


