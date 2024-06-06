package collection;

import java.util.ArrayList;

public class CollectionForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> obj=new ArrayList <String> ();
		obj.add("JAVA");
		obj.add("MAVEN");
		obj.add("ECLIPSE");
		obj.add("GITHUB");
		obj.add("JENKINS");
		for(int i=0;i<obj.size();i++)  //for loop only for generic
		{
			System.out.println(obj.get(i));
		}
	}

}
