class While3
{
	public static void main(String args[])
	{
		int num=15;
		while(num>1)
		{
			if(num%2==0)
			{
				//num=num/2;	
				System.out.println(num);
				num=num/2;
				
			}
			else
			{
				//num=3*num+1;
				System.out.println(num);
				num=3*num+1;

			}
		}
	}
}
	