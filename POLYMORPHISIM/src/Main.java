class Animal {
	private String name;

	public Animal(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	public void speak(){
		
		System.out.println(getName() + "ses çýkarýyor...");
		
	}
	
}
class Bird extends  Animal{

	public Bird(String name) {
		super(name);	
	}

	@Override
	public void speak() {
		System.out.println(getName() + " ötüyor...");
		
	}
}

class Dog extends  Animal{

	public Dog(String name) {
		super(name);	
	}

	@Override
	public void speak() {
		System.out.println(getName() + " havlýyor...");
	}
}

class Cat extends  Animal{

	public Cat(String name) {
		super(name);	
	}

	@Override
	public void speak() {
		System.out.println(getName() + " miyavlýyor...");
	}
}


public class Main {
	public static void main (String[] args){
		Animal animal = new Animal ("Hayvan");
		Bird bird = new Bird ("limon");
		Dog dog = new Dog ("çomar");
		Cat cat = new Cat ("Milu");
		
		animal.speak();
		bird.speak();
		dog.speak();
		cat.speak();
		
	}
}
