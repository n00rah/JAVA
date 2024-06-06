package assignments_java;

		public class Aggregation2 {
		String name;
		int age;
		Aggregation1 reference;
		Aggregation2(String name,int age,Aggregation1 reference)
		{
		this.name=name;
		this.age=age;
		this.reference=reference;
		}
		public void sample()
		{
			System.out.println(name+" "+age);
			System.out.println(reference.empname+" "+reference.address+" "+reference.place);
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Aggregation1 obj1=new Aggregation1("AYAAN","ABCD","TRIVANDRUM");
				Aggregation2 obj2=new Aggregation2("NOORA",27,obj1); 
				obj2.sample();			
				
			}
	}
