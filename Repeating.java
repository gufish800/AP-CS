import java.util.Scanner;

public class Repeating {
	
	public static Scanner scankey;
	
	
	public static void main(String[] args) {
		System.out.println("ENter your word!!!!");
		scankey = new Scanner(System.in);
		String str = scankey.next();
		
		boolean result = noRepeatedCharacters(str);
		System.out.println(result);
		

	}
	
	public static boolean noRepeatedCharacters (String str) {
		boolean check = true;
		int len = str.length();
		char[] target = new char[len];
		for(int i = 0; i < len; i++) {
			target[i] = 0;
		}
		for (int i = 0; i < len; i++){
			char ss = str.charAt(i);
			
			for (int j = 0; j < len; j++){
				if (ss == target[j]){
					check = false;
					break;
				}
			}
			if (check == false)
				break;
			else 
				target[i] = ss;
		}
		
		return check;
	
	}
		
}
