import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum,first_digit,last_digit;
      last_digit=n%10;
      while(n>=10)
      {
        n=n/10;
      }
      first_digit=n;
      sum=first_digit+last_digit;
      System.out.println(sum);
	}
}