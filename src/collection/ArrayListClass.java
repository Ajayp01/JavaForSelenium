package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList obj=new ArrayList();/*ArrayList is dynamic collection of data. 
										so it will keep accepting data until the heap memory gets full.*/
	
		obj.add("one");//store at index 0
		obj.add(4);//store at index 1
		obj.add("two");//store at index 2
		obj.add(3);//store at index 3
		obj.add(4, "5th element");//store at index 4
		
		
		System.out.println("Arraylist elements are " + obj);
		//System.out.println("2nd element is " +obj[1]);//this won't work as it is a ArrayList not array
		
		System.out.println("2nd element is " +obj.get(1));
		
		
		System.out.println("==========Using simple for loop========== ");
		
		//Method 1 to print ArrayList Elements		
		for(int i=0;i<obj.size();i++) {
			System.out.println("Element at the " +i +" position is " + obj.get(i) );
		}
		
		//Method 2
		System.out.println("=========Using Advanced for loop======== ");
		for(Object element:obj) {
			System.out.println( element);
		}
		
		//Method 3 Iterator
		System.out.println("========Using iterator=========");
		Iterator itr=obj.iterator();
		while(itr.hasNext()) {  //check if next element is present in the list
			System.out.println(itr.next());
		}
		
		
		
	}

}
