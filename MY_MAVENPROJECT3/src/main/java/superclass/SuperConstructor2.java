package superclass;

public class SuperConstructor2 extends SuperConstructor1{
	SuperConstructor2()
	{
		super();     //refering constructor of parent class
		//must invoke first first statement
		System.out.println("constructor of child class");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructor2 obj=new SuperConstructor2();
	
	}

}
