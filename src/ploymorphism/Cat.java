package ploymorphism;

public class Cat extends Animal{

	Animal obj;
	String colour="white";
	
	
	public Cat() {
		//by default constructor will be created with super(); =>this call to parent constructor
	}
	public void m1() {
		System.out.println("child class method");
	}
	
	public void m2() {
	
		obj=new Animal();
		obj.babyname="kittens";
		obj.colour="white";
		obj.legs=4;
		
		System.out.println(super.colour);
		super.m1();//used super to access parent method
		
		m1();//child method
	}
	
	
	
	



}
