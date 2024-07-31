import java.util.Scanner;
class swapping
{
	public static void main(String args[])
	{
		int a[]=new int[] {26,6,118,12,44,339,55};
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;	
			}
		}
		for(int j=0;j<a.length-1;j++)
			System.out.print(a[j]+" ");	
	}
}			
