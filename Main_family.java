package Asaaignm_t2;

public class Main_family 
{
public static void main(String[] args) 
{
	Child1 obj = new Child1();
	obj.Anuradha();
	obj.shakunthala();
}
}

	
	class Mother
	{
		public void shakunthala()
		{
			System.out.println("Properties from mother to child");
		}
	}
	class Child1 extends Mother
	{
		public void Anuradha()
		{
			System.out.println("First daughter of mother");
		}
	}
	