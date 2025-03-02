/* 
* We define main function as
  public static void main(String[] args)

* String args contains the command line arguments
* args.length gives number of arguments
* Later in program we can parse arguments in suitable datatypes.
*/

class CommandLineArgs
{
	public static void main(String[] args)
	{
		System.out.println("No. of Cmd line Argument = "+args.length);	
		System.out.println("Arguments are :");
		for (int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}