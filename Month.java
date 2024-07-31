class Month
{
	public static void main(String args[])
	{
		String s="february";
		int year=2020;
		if(s=="january" || s=="march" || s=="may" || s=="july" || s=="august" || s=="october" || s=="December")
			System.out.println("31 days");
		else if(s=="april" || s=="june" || s=="september" || s=="november")
			System.out.println("30 days");
		else if(s=="february")
		{
			if((year%4==0 && year%100!=0) || (year%400==0))
			{
				System.out.println("leap year");
			        System.out.println("29 days");
			}
			else
			{
				System.out.println(" not a leap year");
			        System.out.println("28 days");
			}
		}
		else
			System.out.println("invalid input");
	}
}
