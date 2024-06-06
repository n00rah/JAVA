package inheritance;

public class BabyDog extends Dog
{
public void puppy()
{
	System.out.println("PUPPY'S WORLD");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BabyDog obj=new BabyDog();
obj.puppy();
obj.dogs();
obj.anim();
	}

}
//main method is only needed in child class or last child class