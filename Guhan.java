public class Guhan {
	
	public static void main(String[]args) {
		System.out.println("Hello WOrld");
		int l = 1;
		int h = 5;
		int yxz = sum(l,h);
		System.out.println(yxz);
		int xzy = sum(1,2,yxz);
		System.out.println(xzy);
	}
	
	
	public static int sum (int x, int y){
		System.out.println("sum got called");
		int z = x + y;
		return z;
	}
	
	
	public static int sum (int x, int y, int z){
		System.out.println("sum got calledd");
		int f = sum(x,y) + z;
		return f;
		
	}


}

