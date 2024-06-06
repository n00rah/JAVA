package polymorphism;

public class Poly3 extends Poly2 {
public void show()
{
	super.show();
	System.out.println("SECOND CLASS");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Poly3 obj1=new Poly3();
obj1.show();

//Poly3 obj2=new Poly3();
//obj2.show();
}
}
