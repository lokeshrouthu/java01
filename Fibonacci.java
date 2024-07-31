import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner t=new Scanner(System.in);
		//Scanner b=new Scanner(System.in);

		int a=t.nextInt();
		int b=t.nextInt();
		int c=0,n=3;
		System.out.println(a);
		System.out.println(b);
		while(n<=10)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			n++;
			
		}
	}
}