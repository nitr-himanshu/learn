//ConsOverload1.java
/* This program is for understanding the Constructor overloading
 */
 
 /* Multiple constructor with same name but different definition.
There signature must be different because this is the way by which compiler select the correct cons.
Signature mean
1) no of parameter
2) type of parameter
3) order of parameter */
import java.util.Scanner;

class Test
{
	int a,b;
	float a1,b1;
	void read()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two integer");
		a=scn.nextInt();
		b=scn.nextInt();
	}//Input method
	
	void disp()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}//Output Method for interger only
	
	static void gap()
	{
		System.out.println("");
		System.out.println("");
	}//Here method is static hence no object creation is required to access this
	
	Test()
	{
		a=0;
		b=0;
		System.out.println("##Default constructor##");
	}//Programmer defined Default constructor
	
	Test (int x)
	{
		a = x;
		b = x;
		System.out.println("##Single para const (int x)##");
	}//Single parameterised constructor with int
	
	Test (int x1, int y1)
	{
		a = x1;
		b = y1;
		System.out.println("##Double para const (int x1, int y1)##");
	}//Here no of para. is different from previous const.
	
	Test (int x2, float y2)
	{
		a = x2;
		a1 = y2;
		System.out.println("##Double para const (int x2, float y2)##");
	}//Here no of paramter is same to previous cons. but type is different.

	Test(float x3, int y3)
	{
		a1=x3;
		a = y3;
		System.out.println("##Double para const (float x3, int y3)##");
	}//Here no and type  of paramter is same to previous cons. but order is different.
}

class ConsOverload
{
	public static void main(String[]args)
	{	Scanner s = new Scanner (System.in);
		Test obj1=new Test();//Here object is created by default constructor
		System.out.println("Value of OBJ1 by Default constructor");
		obj1.disp(); //Showing the default value which is provided by Default constructor
		
		Test.gap();
				
		System.out.println("Enter single value for obj2:");
		Test obj2 = new Test(s.nextInt());// Calling contructor with (int x)
		System.out.println("Value of object 2");
		obj2.disp();
		
		Test.gap();
		
		System.out.println("Enter two value for obj3");
		Test obj3 = new Test (s.nextInt(),s.nextInt());
		System.out.println("Value of object 3");
		obj3.disp();
		
		Test.gap();
		
		System.out.println("Enter two (int,float) value for obj4");
		Test obj4 = new Test (s.nextInt(),s.nextFloat());
		System.out.println("Value of object 4");
		System.out.println("Value of int a="+obj4.a);
		System.out.println("Value of float a1="+obj4.a1);	
		
		Test.gap();
		
		System.out.println("Enter two (float,int) value for obj5");
		Test obj5 = new Test (s.nextFloat(),s.nextInt());
		System.out.println("Value of object 5");
		System.out.println("Value of float a1="+obj5.a1);
		System.out.println("Value of int a="+obj5.a);	
	}
	
}
