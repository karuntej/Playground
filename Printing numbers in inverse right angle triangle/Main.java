import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=n;i>0;i--)
      {
        	for(int j=i;j>0;j--)
            {
              	System.out.print(j);
            }
        	System.out.println();
      }
	}
}