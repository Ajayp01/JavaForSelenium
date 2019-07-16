package collection;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		
		TreeSet<String> obj=new TreeSet<String>();
		//Maintains Ascending order
		obj.add("z");
		obj.add("a");
		obj.add("d");
		obj.add("c");
		obj.add("b");
		
		System.out.println(obj);
		//Output: a, b, c, d, z
		
		
	}

}
