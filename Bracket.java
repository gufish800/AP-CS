public class Bracket{
	
	
	public static boolean verifyCurlyBrackets(String s){
		int n = 0;
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			
			if(ch == '{')
				 n = n + 1; 
			if(ch == '}')
				n = n - 1;
			if (n<0)
				return false;  
		}
		if (n==0)
			return true;
		else
			return false;
	
	}
			
	public static void main (String[] args){
		String s = "";
		if(args.length>0)
			s = (args[0]);
		boolean t = verifyCurlyBrackets(s);
		
		System.out.println(s + " these bracket are " + t + " because they are matching!!!");
	}
}
	
