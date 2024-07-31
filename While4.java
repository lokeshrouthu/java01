class While4
{
	public static void main(String args[])
	{
		int base=2,pow=8,start=1,temp=2;
		while(start<=pow)
		{
			System.out.println(base);
			base=temp*base;
			start++;
		}
	}
}