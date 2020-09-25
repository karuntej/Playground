import java.util.Scanner;
class Main
{
      public static int squareofn(int n)
     {
        	int temp=n*n;
        	return temp;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(squareofn(n));
	}
}