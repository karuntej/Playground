import java.util.Scanner;
class Main{
    public static int search(int a[],int n,int key)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args)
    {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         { 
            a[i]=sc.nextInt();
         }
         int key1=sc.nextInt();
         int key2=sc.nextInt();
         int result1=search(a,n,key1);
         int result2=search(a,n,key2);
         System.out.println(result1);
         System.out.println(result2);
     }
}