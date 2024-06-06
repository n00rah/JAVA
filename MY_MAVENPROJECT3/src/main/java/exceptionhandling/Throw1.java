package exceptionhandling;



public class Throw1 {
public void check(int age) 
{
	if(age<18)
	{
		throw new ArithmeticException("PERSON IS NOT ELIGIBLE");
	}
	else if(age==60)
	{
		//System.out.println("PERSION IS ELIGIBLE");
		throw new ArrayIndexOutOfBoundsException(" Not ELIGIBLE");
	}
	else
	{
		throw new NullPointerException("ELIGIBLE");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throw1 obj=new Throw1();
		obj.check(60);
	}

}
