abstract class GrandMother{
	abstract void sleep();
	abstract void eating();
	 void drinking(){
	 	System.out.println("Grand Mother drink water....");
	 }
	 void working(){
		System.out.println(" Grand Mother working....");
	}}
class Father extends GrandMother{	
	 void eating(){
		System.out.println("Father eating food....");
	}
	 void sleep(){
		System.out.println("Father sleeping....");
	}}
class Child2 extends Father{
	void working(){
		System.out.println("Child working ....");
	}
	 void sleep(){
		System.out.println("Child  sleeping....");
	}}
class User2{
	public static void main(String a[])
	{
		Father f1 =new Father();
		f1.working();
		f1.drinking();
		f1.sleep();
		f1.eating();
		

	   Child2 c=new Child2();
		c.sleep();
		c.working();
	}
}