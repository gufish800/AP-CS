public class Factorial{
	
    public static int factorial (int m) {
		int x = 1;
		for(int i = 1; i <= m; i++){
			x = x*i;
		}
		if (m < 0){
			x = -1;
		}
        return x;

	}
	
    public static void main (String[] args){
		int m = Integer.parseInt(args[0]);
		int b = factorial(m);
		
		
		System.out.println("the factorial of " + m + " equals " + b);
	}

}