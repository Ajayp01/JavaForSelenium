package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		
		
		LinkedHashSet<String> obj=new LinkedHashSet<String>();
		//Maintains insertion order
		obj.add("2");
		obj.add("Testing1");
		obj.add("Selenium");
		obj.add("Testing3");
		obj.add("Selenium3");
		obj.add("Testing2");
		obj.add("Selenium2");
		
		System.out.println("Elements are " +obj );
		
		//System.out.println(obj.get(i));//Error: no indexing used to store objects. so get method not available	
		
		
	}

}
