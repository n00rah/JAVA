package interfacepackage;

public class Interfacesample2 implements  Interfacesample1{
public void method1()
{
	System.out.println("INTERFACE 1");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfacesample1 obj=new Interfacesample2();
		obj.method1();
		
	}

}
