package day02;

public class CarExample {
	public static void main(String ar[]){
		Car myCar=new Car();
		
		//read field
		System.out.println(myCar.color);
		System.out.println(myCar.company);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.rpm);
		System.out.println(myCar.speed);
		
		//change field value
		
		myCar.speed=60;
		System.out.println(myCar.speed);
		
	}
}
