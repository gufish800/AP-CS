public class RandomRange {
	public static int randomRange (int low, int high) { 
		double d = Math.random(); //picks between 0.0 to 0.1
		int range = high - low + 1; //getting the amount of int
		int value =(int)(d*range)+low; //d*range creates a random int. We then add low to make the number somewhere in the middle
		return value;
	}
	
	
	
	public static void main (String[] args){
		
		int low = Integer.parseInt(args[0]);
		int high = Integer.parseInt(args[1]);
		
		int result = randomRange (low,high);
		System.out.println("Your value is " + result);
		
	}
	



}
