
abstract class MyClass
{
	public  abstract void display();
}
public class Abstract10 extends MyClass
{
	public void display()
	{
		System.out.println("This is the subclass implementation of the  display method ");
	}
	public  final void main(String a[])
	{
		Abstract10  a1=new Abstract10();
		a1.display();
	}
}