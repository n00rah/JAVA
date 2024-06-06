package collection;

import java.util.ArrayList;

public class CollectionClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj=new ArrayList();
		obj.add("JAVA");
		obj.add("MAVEN");
		obj.add("ECLIPSE");
		obj.add("GITHUB");
		obj.add("JENKINS");
		obj.clear();      //to clear entire array list
		System.out.println(obj);
	}

}
