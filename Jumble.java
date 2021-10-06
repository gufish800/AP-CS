import java.util.Scanner;

public class Jumble {
	
	public static Scanner scankey;
	
	
	public static void main(String[] args) {
		System.out.println("ENter your word!!!!");
		scankey = new Scanner(System.in);
		String str = scankey.next();
		
		String result = jumble(str);
		System.out.println(result);
		

	}
	
	public static String jumble(String str) {
		int len = str.length();
		char[] target = new char[len];
		for(int i = 0; i < len; i++) {
			target[i] = 0;
		}
		for (int i = 0; i < len; i++){
			char ss = str.charAt(i);
			while(true){
				int slotNumber = (int)(Math.random()*len);
				if (target[slotNumber] == 0){
					target[slotNumber] = ss;
					break;
				}
			}
		}
		String result = new String(target);
	
		return result;
	}
}