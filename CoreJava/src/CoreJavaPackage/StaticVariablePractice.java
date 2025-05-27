package CoreJavaPackage;

public class StaticVariablePractice {
	public static String fathername = null;

	public static void getFullName1() {
		String firstname = "Tamanna";
		String lastname = "Madaan";

		String fullName = firstname + " " + lastname;

		fathername = fullName;
		System.out.println(fathername);
	}

	public static void getFatherNameinDanceClass() {
		System.out.println("Second method" +StaticVariablePractice.fathername);

	}

	public static void getFatherNameinTutionClass() {
		System.out.println("Second method" + fathername);

	}

	public static void main(String[] args) {
		 getFullName1() ;
		getFatherNameinDanceClass();
		getFatherNameinTutionClass();

	}
	// when static variable allocate memory?
	// when class is loaded into JVM satic variable will allocate memory .
	// How to identify static variable?
}
// static variables // class// method 