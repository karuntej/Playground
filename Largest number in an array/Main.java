import java.util.*;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        	a[i]=sc.nextInt();
      }
      int max=max_num(a,n);
      System.out.println(max);
    }
  	public static int max_num(int a[],int n)
    {
      	int temp=0;
      	for(int i=0;i<n;i++)
        {
          if(a[i]>temp)
            temp=a[i];
        }
      	return temp;
    }
}