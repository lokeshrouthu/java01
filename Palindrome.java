import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in); 
	int num,n;
	int rem=0,rev=0,temp;
	for(n=1;n<=100000;n++)
	{
		rev=0;temp=n;
		for(num=n;num>0;num/=10)//123321>0 12332>0 1233>0 123>0 12>0 1>0 0>0
		{
			rem=num%10;//1 2 3 3 2 1
			rev=rev*10+rem;//1 12 123 1233 12332 123321
		}
		if(temp==rev)
			System.out.println(rev);
	}
	}
}

	
