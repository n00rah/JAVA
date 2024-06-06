
public class Aggregation2 {
String name;
Aggregation1 address;
Aggregation2(String name,Aggregation1 address)
{
	this.name=name;
	this.address=address;
}
public void display()
{
	System.out.println(name);
	System.out.println(address.name+" "+address.place);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Aggregation1 obj1=new Aggregation1("NOORA","TVM");
Aggregation2 obj2=new Aggregation2("AYAAN",obj1);
obj2.display();

	}

}
