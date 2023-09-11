abstract class Parent
{
	Parent()
	{
		System.out.println("default Parent Constructor");
	}
	Parent(int no)
	{
		System.out.println("Para Parent Constructor");
	}
}
 class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("default Child Constructor");
	}
	Child(int no)
	{
		super(no);

		System.out.println("Para Child Constructor");
	}
	public static void main(String a[])
	{
		Parent p;
		p=new Child();
		p=new Child(10);
	}
}