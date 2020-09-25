import java.util.Scanner;
class Main{
       public static int sumofn(int n)
     {
        	int sum=0;
        	for(int i=0;i<=n;i++)
        		sum+=i;
        	return sum;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(sumofn(n));
	}
}