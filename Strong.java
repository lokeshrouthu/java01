class Strong
{
	public static void main(String args[])
	{
		int num=145,fact=1;
		while(num>0)//145>0
		{
			int rem=num%10;
			fact=1;	
			for(;rem>=2;rem--)
			{
				fact=fact*rem;
			}
			System.out.println(rem+"! is "+fact);
			num=num/10;
		}
		
	}
}