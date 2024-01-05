class Animal{
	void walk() {
		System.out.println("Animals can walk");
	}
}
class Dog extends Animal{
	void walk() {
		System.out.println("Dog can walk");
	}
}
public class oneTryout {
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.walk();
	}
}
