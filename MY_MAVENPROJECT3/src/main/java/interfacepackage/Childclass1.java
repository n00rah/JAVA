package interfacepackage;

public class Childclass1 implements Parentinterface1,Parentinterface2{
public void sample()
{
	System.out.println("MULTIPLE PARENTS");
}
public static void main (String args[])
{
	Childclass1 obj=new Childclass1();
	obj.sample();
}
}
