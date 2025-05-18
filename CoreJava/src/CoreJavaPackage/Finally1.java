package CoreJavaPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//FileNotFoundException//// Exception // Throwable  // IOException
public class Finally1 {

	public static void main(String[] args) throws FileNotFoundException  {

		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\Notes\\Array.txt\\");

		System.out.println("File uploaded successfully");
	}

}
