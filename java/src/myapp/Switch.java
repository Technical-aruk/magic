package myapp;

public class Switch {
	public static void main(String[] args) {
		int num=64;
		double t;  
		double sqrtroot=num/2;  
		do   
		{  
		t=sqrtroot;  
		sqrtroot=(t+(num/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
		System.out.println(sqrtroot);
	}
}