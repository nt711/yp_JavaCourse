package lessone05;

public class Child extends Father
{
	public Child()
	{
		str = str.concat(" World !");
	}
	
	public void display()
	{
		System.out.println(str);
	}
}
