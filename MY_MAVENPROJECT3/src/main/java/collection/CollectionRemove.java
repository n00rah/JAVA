package collection;

import java.util.ArrayList;

public class CollectionRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj=new ArrayList();
		obj.add("JAVA");
		obj.add("MAVEN");
		obj.add("ECLIPSE");
		obj.add("GITHUB");
		obj.add("JENKINS");
		obj.remove(2);      //to remove array list element
		System.out.println(obj);
	}

}
