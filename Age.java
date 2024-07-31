class Age
{
	public static void main(String args[])
	{
		int age=50,year=2024;
		if(age>=50)
			System.out.println("senior citizen");
		else if(age>=25)
			{
			System.out.println("young");
			if(year>=2020)
				System.out.println("eligible for MLC elections");
			}
		else if(age>18)
			System.out.println("eligible to vote");


		else
			System.out.println("minor");
	}
}
			