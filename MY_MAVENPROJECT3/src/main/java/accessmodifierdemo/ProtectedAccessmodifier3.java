package accessmodifierdemo;

import accessmodifiers.ProtectedAccesmodifier1;

public class ProtectedAccessmodifier3 extends ProtectedAccesmodifier1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedAccessmodifier3 obj=new ProtectedAccessmodifier3();  //accessible only by child class
		obj.show();
	}

}
