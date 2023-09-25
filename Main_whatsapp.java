package Asaaignm_t2;

public class Main_whatsapp 
{
	
	
public static void main(String[] args)
{
	Whatapp3 obj= new Whatapp3();
	obj.chatting();
	obj.voicecall();
	obj.voicecall();
	}

}
class Whatsapp1
{
	public void chatting()
	{
		System.out.println("chatting with available in what'sapp");
	}
}

	class Whatsapp2 extends Whatsapp1
	{
		public void voicecall()
		{
			System.out.println("voice call available in what'sapp");
		}
	}
	class Whatapp3 extends Whatsapp2
	{
		public void videocall()
		{
			System.out.println("videocall call available in what'");
		}
	}

