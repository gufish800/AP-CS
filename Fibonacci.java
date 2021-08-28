public class Fibonacci{
	
    public static boolean fib (int m) {
        
        boolean result = false;
	
	int first=1; 
        int second=1;
        int third=first+second;
		
	    	if (m == 1)
			result = true;
		//Loop till more than incoming number
        while(third <= m){
			if (third ==m){
				result = true;	
				break;
			}
			else{
				first=second;
				second=third;
				third=first+second;
            }
        }
		return result;

	}
	
    public static void main (String[] args){
		int m = Integer.parseInt(args[0]);
		boolean b = fib(m);
		System.out.println("The given number " + m + " is "+ b + " in the Fibonacci sequence");
	}

}
