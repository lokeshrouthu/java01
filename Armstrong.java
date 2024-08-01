import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num,count=0,sum=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
		num=temp;
		while(num>0)
		{
			int rem=num%10;
			int power=(int)Math.pow(rem,count);
			sum=sum+power;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("Armstromg");
		else 
			System.out.println("not an Armstrong number");
	}
}
//this is modified armstrong
			