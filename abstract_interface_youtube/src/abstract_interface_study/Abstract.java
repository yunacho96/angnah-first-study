package abstract_interface_study;


// 추상클래스 House
abstract class House{
	private String roof = "House roof";
	private String wall = "House wall";
	private Door door;
	
	void setDoor(Door door) {
		this.door = door;
	}
	
	Door getDoor() {
		return door;
	}
	
	void openDoor() {
		System.out.println("Basic door is opened");
	}
	void closeDoor() {
		System.out.println("Basic door is closed");
	}
}

// 인터페이스 Door: 추상클래스의 메서드를 반드시 호출해야 함 ?
interface Door{
	void openDoor();
	void closeDoor();
}

class MyDoor implements Door{ // 인터페이스 상속 

	@Override
	public void openDoor() {
		System.out.println("My door is opened");
	}

	@Override
	public void closeDoor() {
		System.out.println("My door is closed");
		
	}
	
}

class BasicHouse extends House{ // 추상메서드 상속 
	
	
}

class MyHouse extends House{ //추상메서드 상속 
	@Override
	void openDoor() {
		getDoor().openDoor();
	}
	
	@Override
	void closeDoor() {
		getDoor().closeDoor();
	}
}

public class Abstract { 
	public static void main(String[] args) {
		House basicHouse = new BasicHouse();
		basicHouse.openDoor();
		basicHouse.closeDoor();
		
		House myHouse = new MyHouse();
		Door myDoor = new MyDoor();
		
		myHouse.setDoor(myDoor);
		
		myHouse.openDoor();
		myHouse.closeDoor();
	}

}
