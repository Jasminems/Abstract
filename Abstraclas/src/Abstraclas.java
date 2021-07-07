/*A Java program to create abstract class*/
abstract class Fruit
{
	public abstract void Smango();	//abstract method
	public void sweet()				//non-abstract method
	{
		System.out.println("Mango");
	}
}
class Mango extends Fruit
{
	public void Smango()
	{
		System.out.println("Mango is a Sweet Fruit");
	}
}
public class Abstraclas 
{
	public static void main(String[] args) 
	{
		Fruit m=new Mango();
		m.sweet();	//calling the non-abstract method
		m.Smango();	//calling the abstract method
	}
}
