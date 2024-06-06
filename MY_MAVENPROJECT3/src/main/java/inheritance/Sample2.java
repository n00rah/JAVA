package inheritance;

public class Sample2 extends Sample1{
public void show()
{
	System.out.println("Child class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample2 obj=new Sample2();
obj.meth();
obj.show();
	}

}
