package AnimalSound;

public class Cat extends animal {
	@Override
	public void sound() {
		System.out.println("Meow");
	}
	
	public static void main(String[] args) {
		animal obj = new Cat();
		obj.sound();
	}
}
