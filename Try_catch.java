package Exception_handling;
//two type of exception(cheaked-compiled time), Uncheaked-run time.


public class Try_catch 
{
public static void main(String args[])
{
	try 
	{
	//System.out.println(90/0);
	int data[]= {12};
	System.out.println(data[2]);
	}
	catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException n)
	{
		System.out.println("from catch "+n);
	}
	finally
	{
		System.out.println("always runs");
	}
}
}
