class Character
{
	public static void main(String args[])
	{
		char ch='@';
		if(ch>=65 && ch<=90)
			System.out.println(ch+" is a capital alphabet");
		else if(ch>=97 && ch<=122)
			System.out.println(ch+" is a small alphabet");
		else if(ch>=48 && ch<=57)
			System.out.println(ch+" is a digit");
		else 
			System.out.println(ch+" is a special character");
	}
}

//output=@ is a special character