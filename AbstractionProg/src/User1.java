abstract class Bank1
{
	abstract void interest();
	
}
class Pnb1 extends Bank1
{
	void interest()
	{
		System.out.println("User will get 6% interest.");
	}
}

class Bob1 extends Bank1
{
	void interest()
	{
		System.out.println("User will get 7% interest.");
	}
}

class User1
{
	public static void main(String a[])
	{
		Pnb1 p =new Pnb1();
		p.interest();

		Bob1 b=new Bob1();
		b.interest();
	}
}