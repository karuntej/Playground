import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int sum=0;
      int n=sc.nextInt();
      for(int i=0;i<=n;i++)
      {
			sum=sum+i;
      }
      System.out.println(sum);
	}
}