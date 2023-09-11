abstract class Vehicle2 
{
	abstract  void start();
	void stop()
	{
		System.out.println("Press Break");
	}
}
class Car2 extends Vehicle2 
{
	void start()
	{
		System.out.println(" Start with the key");
	}
}
class Bike2 extends Vehicle2
{
	void start()
	{
		 System.out.println("Start with Button or kick");
	}
} 
class Abstract3{
	public static void main(String a[])
	{
		Vehicle2 vehicle2;
		vehicle2= new Car2();
		vehicle2.start();
		vehicle2.stop();

		vehicle2 = new Bike2();
		vehicle2.start();
		vehicle2.stop();
	}
}

