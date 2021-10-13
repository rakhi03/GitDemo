package javaCollection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//All the classes which implements list interface can accept duplicate values.
		//Arraylist, linked list and vector can accept duplicate values
		
		//Its dynamic size array whereas array has fixed size
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<String> b = new ArrayList<String>();
		b.add("rahul");
				b.add("Java");
				//System.out.println(b);
				b.add(0, "student");
				b.add("Java");
				System.out.println(b);
				//b.remove(1);
//System.out.println(b);
				//b.remove("Java");
				//b.removeAll(b);
System.out.println(b);
System.out.println(b.get(2));
System.out.println(b.contains("testing"));
System.out.println(b.contains("Java"));
System.out.println(b.indexOf("rahul"));
System.out.println(b.isEmpty());
System.out.println(b.size());


	}

}
