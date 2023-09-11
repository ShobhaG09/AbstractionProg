abstract class Parent1
{
	abstract void show1();
	void show2()
	{
		System.out.println("Non abstract show method");
	}
	public static void main(String a[])
	{
		Parent1 p;
		p=new Child1();
		p.show1();
		p.show2();
	}
}
 class Child1 extends Parent1
{
	void show1()
	{
		
		System.out.println("abstract show1 method is overriden");
	}
	
	
}
