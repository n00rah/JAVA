package collection;

import java.util.ArrayList;

public class CollectionForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> obj=new ArrayList <String> ();
		obj.add("JAVA");
		obj.add("MAVEN");
		obj.add("ECLIPSE");
		obj.add("GITHUB");
		obj.add("JENKINS");
		for(String i:obj)  //for each loop only for generic
		{
			System.out.println(i);
		}
	}

}
