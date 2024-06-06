package superclass;

public class SuperMethod2 extends SuperMethod{
public void show()
{
	
	System.out.println("instance method of child class");
	super.show();    //refer instance method of parent class
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperMethod2 obj=new SuperMethod2();
obj.show();

	}

}
