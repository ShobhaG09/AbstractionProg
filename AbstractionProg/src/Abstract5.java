abstract class MyClass1
{
	protected abstract void display();
}
public class Abstract5 extends MyClass1
{
	public void display()
	{
		System.out.println("This is the subclass implementation of the  display method ");
	}
	public static void main(String a[])
	{
		Abstract5  a1=new Abstract5();
		a1.display();
	}
}