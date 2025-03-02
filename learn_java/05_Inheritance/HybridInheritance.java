/* Combination of all other inheritance type..
										BaseClass (Hierarichal)
H										|	
Y										|
B				-----------------------------------------------------------------
R				|						|						|				|
I				|						|						|				|
D				v						v						v				v
				DerivedClass1	(multilevel)		DerivedClass2	(single)	DerivedClass3...........DC(n)
I				|						| 
N				|						|
H				v						v
R				DerivedClass1X1(Hierarichal) DerivedClass1X2
I				------------------
T				|				|
A				|				|
N				v				v
C				DerivedClass1Y1	DerivedClass1Y2
E	

 */
import java.util.Scanner;
class BaseClass
{
	void dispbc()
	{
	System.out.println("BaseClass--DISP.");
	}
}

class DerivedClass1 extends BaseClass
{
	void disp()
	{
	System.out.println("DerivedClass1--DISP.");
	}
}
 
class DerivedClass2 extends BaseClass
{
	void disp()
	{
	System.out.println("DerivedClass2--DISP.");
	}
}


class DerivedClass3 extends BaseClass
{
	void disp()
	{
	System.out.println("DerivedClass3--DISP.");
	}
}


class DerivedClass1X1 extends DerivedClass1
{
	void disp()
	{
	System.out.println("DerivedClass1X1--DISP.");
	}
}

class DerivedClass1Y1 extends DerivedClass1X1
{
	void disp()
	{
	System.out.println("DerivedClass1Y1--DISP.");
	}
}

class DerivedClass1Y2 extends DerivedClass1X1
{
	void disp()
	{
	System.out.println("DerivedClass1Y2--DISP.");
	}
}


class DerivedClass1X2 extends DerivedClass2
{
	void disp()
	{
	System.out.println("DerivedClass1X2--DISP.");
	}
}

class HybridInheritance
{	
	public static void main (String [] args)
	{	
		DerivedClass1Y1 obj1 = new DerivedClass1Y1();
		DerivedClass1Y2 obj2 = new DerivedClass1Y2();
		
		DerivedClass1X2 obj3 = new DerivedClass1X2();
		
		DerivedClass3 obj4 = new DerivedClass3();
		
		obj1.disp();
		obj1.dispbc();
		
		obj2.disp();
		obj2.dispbc();
		
		obj3.disp();
		obj3.dispbc();
		
		obj4.disp();
		obj4.dispbc();
		
		
	}
}