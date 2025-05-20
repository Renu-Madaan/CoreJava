
package CoreJavaPackage;

public class TestIllegalArgument {

    // Custom method that throws IllegalArgumentException
    public void myMethod(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        } else {
            System.out.println("Value is: " + value);
            //illegal Exception
        }
    }

}
