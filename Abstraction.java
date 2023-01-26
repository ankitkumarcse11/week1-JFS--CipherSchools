package abstraction;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car c=new Car(); we can not make object of abstract class
//		c.name="ankit";
		Audi a1=new Audi();
		a1.start();

	}

}
abstract class Car{
	String name;
	int price;
	abstract void  start();
//	{
//		System.out.println("car starts");
//	}
}
class Audi extends Car{

	void start() {
		// TODO Auto-generated method stub
		System.out.println("audi is strting");
		
	}
	
}
class Bmw extends Car{

	void start() {
		// TODO Auto-generated method stub
		System.out.println("bmw is starting");
		
	}
	
}