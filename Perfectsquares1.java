class Perfectsquares1
{
	public static void main(String args[])
	{
		int num=1;
		while(num<=1000);
		{
			/*double sqrt=Math.sqrt(num);
			double pow=Math.pow(sqrt,2);*/
			if(Math.sqrt(num)==(int)Math.sqrt(num))
				System.out.println(num);
			num++;
			System.out.println(num);
		}
	}
}