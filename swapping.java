import java.util.Scanner;
class swapping
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements of array");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		if(size%2==0)
		{
			for(int x=0;x<=a.length-1;x+=2)
			{
				int t=a[x];
				a[x]=a[x+1];
				a[x+1]=t;
			}
			for(int x=0;x<=a.length-1;x++)
			{
				System.out.println(a[x]);
			}
		}
	}		
}