package CoreJavaPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Finally {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
try {
	FileInputStream fis =new FileInputStream("C:\\Users\\user\\Desktop\\Notes\\Array.txt\\");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("File uploaded successfully");
	}}


//finally keyword is used in a try catch block statement to specify a block of code which gets executed regardless of
//whether the exception is thrown or not thrown.

