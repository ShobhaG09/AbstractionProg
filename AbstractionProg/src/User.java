abstract class Bank
{
	void interest()
	{
		System.out.println("Hello All.....");
	}
}
class Pnb extends Bank
{
	
}
class User
{
	public static void main(String a[])
	{
		Pnb p =new Pnb();
		p.interest();
	}
}