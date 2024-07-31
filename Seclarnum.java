import java.util.Scanner;
class Seclarnum
{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	System.out.println("enter a number:");
	int temp=num,max=0;
	while(num>0)
	{
		int rem=num%10;
		if(rem>max)
			max=rem;
		num=num/10;
		System.out.println(num);
	}
	num=temp;
	while(num>0)
	{
		int rem1=num%10;
		if((rem1<max) && (rem1>rem))
			System.out.println(rem1);
		num=num/10;
	}
}

	




















	