class Leapyear
{
	public static void main(String args[])
	{
		int a=2016;
		if((a%4==0 && a%100!=0) || (a%400==0))
			System.out.println(a+" is a leap year");
		else 
			System.out.println(a+" is not a leap year");
	}
}

//output=2016 is a leap year