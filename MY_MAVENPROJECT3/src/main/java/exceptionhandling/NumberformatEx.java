package exceptionhandling;

public class NumberformatEx {
public void show()
{
	try
	{
	String s="HELLO";
	int num=Integer.parseInt(s);
	/*String t="hai";
	String p=s+t;
	System.out.println(p);*/
	/*String p=s;
	System.out.println(p);*/
	//float num1=Float.parseFloat(s);
	
	}
	catch(NumberFormatException f)
	{
		System.out.println(f);
		System.out.println("NUMBER FORMAT EXCEPTION HANDLED");
	}
	finally
	{
		System.out.println("FINALLY BLOCK EXECUTED");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberformatEx obj=new NumberformatEx();
		obj.show();
	}

}
