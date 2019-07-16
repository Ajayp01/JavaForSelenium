package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListWithGenerics {

	public static void main(String[] args) {
		
		/*Generics used to force ArrayList to accept only specified type of the elements*/
		
		ArrayList<String> obj=new ArrayList<String>(); /*child reference - child object
														so all the methods are accessible.
														-some from Collection interface
														-some from List interface
														-some from ArrayList class methods */
		obj.add("Automation");
		obj.add("Testing");
		//obj.add(2);//Compile time ERROR=>>The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
		System.out.println(obj);
		
		//List interface	
		List<String> obj1=new ArrayList<String>();//We can use reference of List interface as well to access more methods
		obj1.add("List Interface");//parent reference - child object
		
		//Collection interface
		Collection<String> obj2=new ArrayList<String>();//We can use reference of Collection interface as well but access less methods
		obj2.isEmpty();//parent reference - child object so only methods of Collection will be accessed
	}
	
}
