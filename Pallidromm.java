import java.util.Scanner;
class Pallidromm 
{

  public static void main(String[] args) 
  {
    // TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range for pallindrome : ");
    int n=sc.nextInt();
      for(int i=10;i<=n;i++)
      {
     	 int rem=0,rev=0;
      	 for(;i!=0;i/=10)
      	{
        	rem=i%10;
        	rev=rev*10+rem;
      	}
      	if(rev==i)
      {
        System.out.println(i+" is a pallindrome");
      }
       }
  }
}