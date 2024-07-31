
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
		for(i=0;i<=n1;i++);
		{
			if(n1%i==0)
			{
				count++;
			}
		}
		for(j=0;j<=n2;j++);
		{
			if(n2%j==0)
			{
				count1++;
			}
		}
		int diff=Math.abs(n1-n2);
		if(count==2 && count1==2 && diff==2)
			System.out.println(" Twin Primes");
		else
			System.out.println("not Twin Primes");
                
	
	}
}