package CoreJavaPackage;

public class ThisKeyword1 {
	void show() {
		System.out.println(this);
	}

	public static void main(String[] args) {

		ThisKeyword1 k1 = new ThisKeyword1();
		System.out.println(k1);
	}

}
// this keyword refers to the current object which is placed (this) inside a method or constructor
// this keyword represents the current instance of class