package collection;

import java.util.ArrayList;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj=new ArrayList();
		obj.add("JAVA");
		obj.add("MAVEN");
		obj.add("ECLIPSE");
		obj.add("GITHUB");
		obj.add("JENKINS");
		obj.set(2, "C++");       //to set new item from arraylist
		//System.out.println(obj.get(2));
		System.out.println(obj);
	}

}
