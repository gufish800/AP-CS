public class RandomRange {
	public static int randomRange (int low, int high) {
		double d = Math.random();
		int range = high - low + 1;
		int value =(int)(d*range)+low;
		return value;
	}
	
	
	
	public static void main (String[] args){
		
		int low = Integer.parseInt(args[0]);
		int high = Integer.parseInt(args[1]);
		
		int result = randomRange (low,high);
		System.out.println("Your value is " + result);
		
	}
	



}