abstract class Vehicle 
{
	abstract  void start();
	void stop()
	{
		System.out.println("Press Break");
	}
}
class Car extends Vehicle 
{
	void start()
	{
		System.out.println(" Start with the key");
	}
}
class Bike extends Vehicle 
{
	void start()
	{
		 System.out.println("Start with Button or kick");
	}
} 
class Abstract1{
	public static void main(String a[])
	{
		Car maruti= new Car();
		maruti.start();
		maruti.stop();

		Bike hero = new Bike();
		hero.start();
		hero.stop();
	}
}
