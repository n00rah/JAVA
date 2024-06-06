package abstraction;

interface InterA
{
	void meth1();
}
interface InterB
{
	void meth2();
}
class Interface1 implements InterA,InterB
{
	public void meth1()
	{
		System.out.println("meth1");
	}
	public void meth2()
	{
		System.out.println("meth2");
	}
}
