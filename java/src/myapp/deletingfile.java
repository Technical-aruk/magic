package myapp;
import java.io.File;

public class deletingfile {

	public static void main(String[] args) {
		File obj=new File("C:\\Users\\gogan\\Desktop\\html\\filehandling\\sample.txt");
if(obj.delete()) {
	System.out.println("file deleted");
}else {
	System.out.println("file is not deleted");
}

	}

}
