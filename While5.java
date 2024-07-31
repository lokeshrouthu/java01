class While5
{
	public static void main(String args[])
	{
		int n1=40,n2=20,min=0,lcf=0,start=2;
		if(n1<n2)
			min=n1;
		else
			min=n2;
		while(start<=min)
		{
			if(n1%min==0 && n2%min==0)
			{
				//System.out.println(min);
				lcf=start;
				start++;
				break;
			}
		}
		System.out.println("lcf is "+lcf);
	}
}
				