import java.util.Scanner;
class Smallestdig
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("enter a number:");
		int temp=num,min=9;
		while(num>0)
		{
			int rem=num%10;
			if(rem<min)
				min=rem;
			num=num/10;
		}
		System.out.println("smallest digit of "+temp+" is "+min);
	}
}
			
			
		
		