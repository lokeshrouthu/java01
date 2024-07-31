class Insurance
{
	public static void main(String args[])
	{
		String martialstatus="Unmarried";
		char gender='F';
		int age=26;
		if(martialstatus=="Unmarried")
		{
			if(gender=='M' && age>30)
				System.out.println("Insurance is applicable");
			else if(gender=='F' && age>25)
				System.out.println("Insurance is applicable");
			else
				System.out.println("Insurance is not applicable");
		}
		else if(martialstatus=="Married")
			System.out.println("Insurance is applicable");
		else
			System.out.println("Insurance is not applicable");
	}
}

//output=Insurance is applicable
		