public class NorM {
	public static void multiplesOfNorM (int m, int n) {
		for(int k =1; k <= 1000; k++) {
			if (k % n ==0 && k % m ==0){ 
				continue; //checks for both
			}
			
			if (k % m == 0) //checks for one
				System.out.println(k);
			
			
			if (k % n ==0) //checks for the second
				System.out.println(k);
		}
		
	}
	public static void main (String[] args){
		
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		
		multiplesOfNorM(m,n);
	}
}
