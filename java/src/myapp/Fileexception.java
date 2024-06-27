package myapp;
import java.io.File;
import java.io.IOException;




public class Fileexception {
public static void main(String[]args) {
	File obj=new File("C:\\Users\\gogan\\Desktop\\html\\filehandling\\sample.txt");
	try {
		if(obj.createNewFile()) {
			System.out.println("File is created"+obj.getName());
		}else {
			System.out.println("File already created");
		}}
		catch(IOException e) {
			System.out.println("error");
		}
		
	
}
}
