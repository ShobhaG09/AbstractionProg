abstract class Vehicle1 
{
	abstract  void start();
	void stop()
	{
		System.out.println("Press Break");
	}
}
class Car1 extends Vehicle1 
{
	void start()
	{
		System.out.println(" Start with the key");
	}
}
class Bike1 extends Vehicle1 
{
	void start()
	{
		 System.out.println("Start with Button or kick");
	}
} 
class Abstract2{
	public static void main(String a[])
	{
		Vehicle1 maruti= new Car1();
		maruti.start();
		maruti.stop();

		Vehicle1 hero = new Bike1();
		hero.start();
		hero.stop();
	}
}