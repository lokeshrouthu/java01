class Ncr
{
	public static void main(String args[])
	{
		int n=5,r=2,res;
		int i=n,j=r,k=(n-r);
		int pdtn=1,pdtr=1,pdtnr=1;
		while(i>=1)
		{
			pdtn=pdtn*i;
			i--;
		}
		//System.out.println(pdt1);
		while(j>=1)
		{
			pdtr=pdtr*j;
			j--;
		}
		while(k>=1)
		{
			pdtnr=pdtnr*k;
			k--;
		}
		res=pdtn/(pdtr*pdtnr);
		System.out.println(res);
	}
}
				