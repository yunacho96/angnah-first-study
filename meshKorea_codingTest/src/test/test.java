package test;


public class test {
	public static void main(String[] args) {
		Car car = new Car();
		car.type();
		
		SUV suv = new SUV();
		suv.type();
		
	}

}

class Car{
	public void type() {
		System.out.println("A car is very cool");
	}
}

class SUV{
	public void type() {
		System.out.println("A SUV is very cool");
	}
}