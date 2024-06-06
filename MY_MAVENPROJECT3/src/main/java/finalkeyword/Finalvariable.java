package finalkeyword;

public class Finalvariable {
final int age=12;  //cannot change final variable

public void show()
{
	age=30;
	System.out.println(age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Finalvariable obj=new Finalvariable();
obj.show();
	}

}
