class While2
{
	public static void main(String args[])
	{
		int num1=6,num2=12,start=1,highest=0;
		if(num1<=num2)
		{
			while(start<=num2)
			{
				if((num2%start==0) && (num1%start==0))
				{
					System.out.println(start);
					highest=start;
					//System.out.println(highest);
				}
				start++;
				//System.out.println(highest);
			}
			System.out.println("highest cf is "+highest);
		}
		else
		{
			while(start<num2)
			{
				if((num2%start==0) && (num1%start==0))
				{
					System.out.println(start);
					highest=start;
					//System.out.println(highest);

				}
				start++;
				//System.out.println(highest);
			}
			System.out.println("highest cf is "+highest);
		}
	}
}
