package inheritance;           //Hierarchical inheritance - single parent, multiple child

public class Jasmine extends Flower{
public void stem()
{
	System.out.println("WHITE");
}                                                       //flower - leaf()    rose -petals()     Jasmine - stem()

public static void main(String[] args) {
	// TODO Auto-generated method stub
Jasmine obj=new Jasmine();
obj.stem();
obj.leaf();
//obj.petals();     cannot access
Rose obj1=new Rose();    //object creation of another child class
obj1.petals();
obj1.leaf();

}

}
