import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n=in.nextInt();
     
      for(int i=1;i<=2;i++)
      {
        	for(int j=1;j<=i;j++)
            {
              if((i+j)%2==0)
              	System.out.print("*");
              else
                System.out.print("#");
 
            }
        	System.out.print("\n");
       }
      
      for(int i=3;i<=4;i++)
      {
        	for(int j=1;j<=i;j++)
            {
              if((i+j)%2==0)
              	System.out.print("#");
              else
                System.out.print("*");
 
            }
        	System.out.print("\n");
       }
      for(int i=5;i<=n;i++)
      {
        	for(int j=1;j<=i;j++)
            {
              if((i+j)%2==0)
              	System.out.print("*");
              else
                System.out.print("#");
 
            }
        	System.out.print("\n");
       }
    }
}