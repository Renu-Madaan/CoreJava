package CoreJavaPackage;

public class StaticVariablePractice {
	public static String fullName;
	
	public String getFullName() {
		String firstname = "Hamesh";
		String lastname = "Madaan";

		String fullName = firstname + " " + lastname;

		System.out.println("Full Name: " + fullName);
		return fullName;
	}
	
	public void  getFullName2() {
		System.out.println("Second method" +fullName);
		;
		
	}
	public static void main(String[] args) {
		StaticVariablePractice s1= new StaticVariablePractice();
		s1.getFullName();
		s1.getFullName2();
		
	}	
	
}
// static variables // class// method 