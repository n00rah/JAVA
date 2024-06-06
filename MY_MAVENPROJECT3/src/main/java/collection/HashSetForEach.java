package collection;

import java.util.HashSet;

public class HashSetForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> obj=new HashSet <String> ();
		obj.add("JAVA");
		obj.add("CPP");
		obj.add("PYTHON");
		for(String s:obj)
		{
			System.out.println(s);
		}
	}

}
