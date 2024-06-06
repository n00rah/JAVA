package polymorphism;

public class Poly {
public void pol()
{
	System.out.println("POLYMORPHISM");
}
public void pol(String name)
{
	System.out.println(name);
}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Poly obj=new Poly();
		obj.pol();
		obj.pol("NOORA");
	}

}
