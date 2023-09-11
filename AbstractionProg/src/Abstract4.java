abstract class Vehicle3 {
	abstract  void start();
	void stop()
	{
		System.out.println("Press Break");
	}
}
abstract class Car3 extends Vehicle3 
{
}
class Maruti extends Car3 {
	void start()
	{
		 System.out.println("Start with Button ");
	}
} 
class Audi extends Car3 {
	void start()
	{
		 System.out.println("Start with Button or kick");
	}
} 
class Abstract4{
	public static void main(String a[])
{
		Vehicle3 vehicle;
		vehicle= new Maruti();
		vehicle.start();
		vehicle.stop();

		vehicle = new Audi();
		vehicle.start();
		vehicle.stop();
	}
}
