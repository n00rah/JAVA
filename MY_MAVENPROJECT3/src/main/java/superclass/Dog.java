package superclass;

public class Dog extends Animal {
String name="MAVEN";
public void sup()
{
	System.out.println(name);
	System.out.println(super.name);   //refer instance variable of parent class
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog obj=new Dog();
obj.sup();
	}

}
