public class Car {
	int wheels;
	int windows;
	String colour;
	// hello world
	public Car () {
		wheels = windows = 0;
		colour = "";
	}
	
	public Car (int w, int win, String c) {
		wheels = w;
		windows = win;
		colour = c;
	}
	
	public String getBehavior(){
		if(wheels==4 && colour=="green")
			return "ugly";
		
		if(windows == 0 && colour == "black")
			return "cool";
		
		return "Poop";
	}
	
	public static void main (String [] args) {
		Car c1 = new Car (4,4,"green");
		Car c2 = new Car (4,0,"black");
		Car c3 = new Car();
		System.out.println(c1.getBehavior());
		System.out.println(c2.getBehavior());
		System.out.println(c3.getBehavior());
		
	}
}