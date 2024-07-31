class Leapyear1
{
	public static void main(String args[])
	{
		int A=65,B=40;
		if(A>=55 && B>=45)
			System.out.println("degree qualified");
		else if((A>=45 && A<55) && B>=55)
			System.out.println("degree qualified");
		else if(A>=65 && B<=45)
			System.out.println("REATTEMPT");
		else
			System.out.println("failed");


			
	}
}