package accessmodifiers;

public class PrivateAccessmodifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateAccessmodifier1 obj=new PrivateAccessmodifier1();
		obj.show1();       //scope only in class
		System.out.println(obj.a);   //scope inside the class
	}

}
