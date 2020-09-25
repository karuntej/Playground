import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int temp,rev=0;
      int a=num;
      while(num>0)
      {
        	temp=num%10;
        	num=num/10;
        	rev=rev+(temp*temp*temp);
      }
      if(rev==a)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}