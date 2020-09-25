import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int a,b,c,sum=0;
      int k=num;
      while(num!=0)
      {
        	a=1;
        	b=1;
        	c=num%10;
        	while(a<=c)
            {
              	b=b*a;
              	a++;
            }
        	sum=sum+b;
        	num=num/10;
      }
      if(k==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
      }
	}