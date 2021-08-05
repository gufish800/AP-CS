

public class Test {


public static void main(String[] args) {

    int[] x = new int[100];

    System.out.println(x[0]);
    
    System.out.println(195/2);

    String s1 = "9";
    String s2 = "7";
    System.out.println(s1 + "" + s2);

   int sum = 0;
   for(int i = 1; i < 20;i += 2) {
      sum = sum + (i * i);
   }
   System.out.println(sum);

   int[] nums = {1,2};
   System.out.println(nums.length);
   
   foo("ANTON");

}

public static String foo(String str) {
		String newStr = "";
		int n = str.length()-1;
		while (n>0) {
			newStr += str.substring(n--);
			System.out.println("foo#" + newStr + "#");
		}
		return newStr;

}

}