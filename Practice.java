import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {
    scankey = new Scanner(System.in);
      method();
  }
  
  public static void method() {
      System.out.println("enter you, number, enter 0 to quit");
      int x = scankey.nextInt();
      
    if (x!= 0) {
      for(int i=1;i<=x;i++) {
          if (x % i ==0)
            System.out.print(i+",")
        }
    }
    
  }
}
     
