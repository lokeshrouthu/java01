class While1
{
	public static void main(String args[])
	{
		int num=20,start=1,sum=0,product=1;
		while(start<=num)
		{
			if(num%start==0)
			{
				if(start%2==0)
				{
					sum=sum+start;
					//System.out.println(start);
				}
				else
				{
					product=product*start;
					//System.out.println(start);
				}
				System.out.println(start);
			}
			start++;
		}
		System.out.println(sum);
		System.out.println(product);
	}
}