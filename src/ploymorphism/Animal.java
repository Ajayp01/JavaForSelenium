package ploymorphism;

public class Animal {

	String colour="black";
	int legs;
	String babyname;
	
	public Animal() {
		System.out.println("No arguments parent constructors");
	}
	
	public Animal(String a) {
		System.out.println("Single argument parent constructors");
	}
	
	public Animal(String a, int b) {
		System.out.println("Double argument parent constructors");
	}
	public void m1() {
		System.out.println("parent class method");
	}	
	
}
