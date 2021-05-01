package AnimalSound;

public class Horse extends animal {
	@Override
	public void sound() {
		System.out.println("Neigh");
	}
	
	public static void main(String[] args) {
		animal obj = new Horse();
		obj.sound();
	}
}
