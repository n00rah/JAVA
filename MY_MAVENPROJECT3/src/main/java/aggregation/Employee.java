package aggregation;

public class Employee {
int id;
String name;
Address address;  //reference variable of first class
Employee(int id,String name,Address address)
{
	this.id=id;
	this.name=name;
	this.address=address;
}
public void show()
{
	System.out.println(id+" "+name);
	System.out.println(address.city+" "+address.state+" "+address.country);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address obj1=new Address("TRIVANDRUM","KERALA","INDIA");
Employee obj2=new Employee(12,"NOORA",obj1);
obj2.show();
	}

}
