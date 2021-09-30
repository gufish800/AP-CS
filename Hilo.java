import java.util.Scanner;

public class Divisors {
    
public static Scanner scankey;
    
    public static void main(String[] args) {
        scankey = new Scanner(System.in);
            method();
    }
    
    public static void method() {
        int y = (int)(Math.random()*100);
       
         System.out.print(y);
        int m = -1;
        
        while (y != m){
            System.out.print("enter your number");
            m = scankey.nextInt();
            if (m>y){
                System.out.println("go lower");
            }   
            else 
                if (m<y){
                    System.out.println("go higher"); 
                }
                else
                     System.out.print("congrats");
          
            
        }
    
    }
}
