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
		
		System.out.println(getName() + "ses ��kar�yor...");
		
	}
	
}
class Bird extends  Animal{

	public Bird(String name) {
		super(name);	
	}

	@Override
	public void speak() {
		System.out.println(getName() + " �t�yor...");
		
	}
}

class Dog extends  Animal{

	public Dog(String name) {
		super(name);	
	}

	@Override
	public void speak() {
		System.out.println(getName() + " havl�yor...");
	}
}

class Cat extends  Animal{

	public Cat(String name) {
		super(name);	
	}

	@Override
	public void speak() {
		System.out.println(getName() + " miyavl�yor...");
	}
}


public class Main {
	public static void main (String[] args){
		Animal animal = new Animal ("Hayvan");
		Bird bird = new Bird ("limon");
		Dog dog = new Dog ("�omar");
		Cat cat = new Cat ("Milu");
		
		animal.speak();
		bird.speak();
		dog.speak();
		cat.speak();
		
	}
}
