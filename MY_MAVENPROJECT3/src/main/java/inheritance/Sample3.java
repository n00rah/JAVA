package inheritance;

public class Sample3 extends Sample2{
public void display()
{
	System.out.println("Third Class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample3 obj=new Sample3();
obj.meth();
obj.show();
obj.display();
	}

}
