
import java.lang.Math;
import java.util.Scanner;
class Twinprimes
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter NUM1");
		int n1=sc.nextInt();
		System.out.println("Enter NUM2");
		int n2=sc.nextInt();
		int i,j,count=0,count1=0;
		for(i=2;i<=n1/2;i++);
		{
			if(n1%i==0)
			{
				count++;
			}
		}
		for(j=2;j<=n2/2;j++);
		{
			if(n2%j==0)
			{
				count1++;
			}
		}
		int diff=Math.abs(n1-n2);
		if(count==0 && count1==0 && diff==2 && n1!=1 && n2!=1)
			System.out.println(" Twin Primes");
		else
			System.out.println("not Twin Primes");
                
	
	}
}