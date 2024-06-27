package myapp;

public class whitespace {
	public static void main(String[] args)
    {
        String str = "     madara uchiha   ";
 
        
        str = str.replaceAll("\\s", "");
 
        System.out.println(str);
    }
}
