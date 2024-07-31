class Five
{
	public static void main(String args[])
	{
		int num=550;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			rem=rem+1;
			rem=rem%10;
			num=num/10;
			System.out.print(rem);
			
		}
		//System.out.println(rem);
	}
}