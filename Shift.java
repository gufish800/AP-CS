import java.util.Scanner;

public class Shift {
	
	public static Scanner scankey;
	
	
	public static void main(String[] args) {
		System.out.println("ENter your word!!!!");
		scankey = new Scanner(System.in);
		String str = scankey.next();
		
		System.out.println("Enter spaces");
		scankey = new Scanner(System.in);
		int spaces = scankey.nextInt();
		
		String result = shift(str, spaces);
		System.out.println(result);
		

	}
	
	public static String shift(String str, int spaces) {
		int len = str.length();
		int n = len - spaces;
		String temp1= str.substring(0, n);
		String temp2= str.substring(n, len);
		String result = temp2 + temp1;
	
		return result;
		
	
	
	
	
	
	}
}