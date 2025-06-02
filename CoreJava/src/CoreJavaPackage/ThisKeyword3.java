package CoreJavaPackage;

public class ThisKeyword3 {

	
		int  a;
		 ThisKeyword3( int  a)
		 {
			this.a=a;
		 }
		 void show() {
		 System.out.println(a); 
		 }
public static void main(String[] args) {
	ThisKeyword3 k3 =new ThisKeyword3 (100);
	k3.show();
}

	}

 
//whenever, local variable and instance variable  are with same name then our run time environment get confused 
//To avoid this problem we should use this keyword ..