/* 
- Instance block will execute each and every time whenever an object is created.
- before executing the constructor and after executing the static block of particular class.
*/


class InstanceBlock
{	
	
		{
			System.out.println("Instance Block");
		}
		
        static
		{
			System.out.println("Static Block");
		}
        
        {
			System.out.println("Instance Block2");
		}
		
        InstanceBlock()
		{
			System.out.println("Default constructor");
		}
		
	public static void main (String [] args)
	{
		System.out.println("main");
		InstanceBlock obj1=new InstanceBlock();
	}
}