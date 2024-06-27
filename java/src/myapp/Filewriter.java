package myapp;
import java.io.IOException;
import java.io.FileWriter;

public class Filewriter {
	public static void main(String[]args) {
		try {
			FileWriter obj=new FileWriter("C:\\Users\\gogan\\Desktop\\html\\filehandling\\sample.txt");
			obj.write("hello world");
			obj.close();
			System.out.println("file writing successfully");
		}
		catch(IOException e) {
			System.out.println("error occured");
		}
	}
}
