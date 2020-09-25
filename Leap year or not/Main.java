import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		// Type your code here
    	int n=sc.nextInt();
		if(((n%4==0)&&(n%100!=0))||((n%100==0)&&(n%400==0)))
		{
		    System.out.print("Leap year");
		}
		else
		{
		    System.out.print("Non Leap year"); 
		}
    }
}