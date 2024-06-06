package aggregation;

public class Aggregate2 {
int id;
String designation;
Aggregate1 aggregate;
Aggregate2(int id,String designation,Aggregate1 aggregate)
{
	this.id=id;
	this.designation =designation;
	this.aggregate=aggregate;
}
public void show()
{
	System.out.println(id+" "+designation);
	System.out.println(aggregate.name+" "+aggregate.address+" "+aggregate.place);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregate1 obj1=new Aggregate1("Noora","Tabcd","hvxcg");
		Aggregate2 obj2=new Aggregate2(123,"Tester",obj1);
		obj2.show();
	}

}
