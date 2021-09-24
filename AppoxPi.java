public class AppoxPi{
	
    public static double approximatePI (int m) {
		
	
		double x = 0.0;	
		double denom = 1.0;
		double sign = 1.0;
		for(int i=0;i< m; i++) {
			
			
			
			x = x + sign * (1/denom);
			
			
			
			denom = denom + 2;
			
			sign = sign*-1;
			
		}
		System.out.println(x*4);
		
		
        return x*4;
	
        
    }
	
    public static void main (String[] args){
		int m = Integer.parseInt(args[0]);
		double api = AppoxPi.approximatePI(m);
		
		
		
		
	}

}