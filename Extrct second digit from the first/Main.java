import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int second_digit;
      while(n>=100)
      {
        n=n/10;
      }
      second_digit=n%10;
      System.out.println(second_digit);
    }
}