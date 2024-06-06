package interfacepackage;

public class Interfacechildclass2 implements Interfaceparent{
public void sample1()
{
	System.out.println("SECOND CHILD INTERFACE");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceparent obj=new Interfacechildclass1();
		obj.sample1();
	}

}
