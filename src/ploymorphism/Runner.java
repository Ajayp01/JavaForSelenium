package ploymorphism;

public class Runner {

	
	public Runner() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		Animal obj=new Animal();//parent reference - parent object=>Only parent methods
		obj.m1();
		
		
		Cat obj1=new Cat();//child reference - child object=>All methods
		obj1.m1();//from child class
		obj1.m2();
		
		
		Animal obj2=new Cat();//parent reference - child object=>Only parent methods
		obj2.m1();//Preference given to child class m1 method if m1 overridden. If not then parent method
		//obj2.m2(); not allowed
		
		Runner r=new Runner();
	
	
	
	}

}
