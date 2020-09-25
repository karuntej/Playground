import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int result=greatest(n1,n2);
      System.out.println(greatest(result,n3));
	}
  	public static int greatest(int n1,int n2)
    {
      	int max=0;
      	if(n1>n2)
          max=n1;
        else
          max=n2;
      	return max;
    }
}