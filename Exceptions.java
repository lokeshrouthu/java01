class Exceptions
{
	public static void main(String args[])
	{
		Child c=new Parent();
		c.one(); 
	}
}
class Parent
{
	void one()
	{
		System.out.println("parent one");
	}
}

class Child
{
	void one()
	{
		System.out.println("child one");
	}
}