import java.util.Scanner;
class Sumpdt
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,pdt=1;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
				sum=sum+rem;	
			else 
				pdt=pdt*rem;
			num=num/10;
		}
		System.out.println(sum);
		System.out.println(pdt);
		
	}
}	
		
		
