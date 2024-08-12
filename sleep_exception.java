package Exception_handling;

// we can't use throws in ccase of overlodding.
class p12
{
	void call()
	{
		System.out.println("from call p12");
	}
}

class p21 extends p12
{
	void call()
	//throw Exception
	{
		System.out.println("from p21");
	}
}

public class sleep_exception
{
public static void main(String args[])
{
	try
	{
		Thread.sleep(2000);
		System.out.println("after 2 sec.");
	}
	catch(InterruptedException e)//TODO Auto-generated catch block
	
	{
		e.printStackTrace();
		
	}
}
}
