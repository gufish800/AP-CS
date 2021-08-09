public class Password{
	
	
	public static String generatePassword(){
		
		
		char[] pass = new char[8];
		int [] let = {0,1,2,5,6};
		int [] num = {3,4,7};
		char ch = 'G';
		
		for(int i=0; i < 5 ;i++){
			double d = Math.random();
			int rand = (int)(d *52);
			if (rand < 26)
				ch = (char)('A' + rand);
			else
				ch = (char)('a' + (rand-26));
			
			pass[let[i]]=ch;	
			
		}
		
		for(int k=0; k < 3 ;k++){
			double d = Math.random();
			int rand = (int)(d *10);
			ch = (char)('0' + rand);
			pass[num[k]]=ch;
			
		}
		
		return new String(pass);
	
	}	
			
	public static void main (String[] args){
		
		String str = generatePassword();

		
		System.out.println("The Generated password is " + str);
	}
	

}
	
		
		
		
		
		
		
		
	
	
	
	
	
	
