/* 	
- defined using "static" keyword
- Use to define class variable, method or block
- Static block runs only once, while loading class
- static variable, method accessible to all the objects.
 */
import java.util.Scanner;

class Student
{
	static String schoolName = "New school";
	int stId;
	String stName;
	static String course;
	Scanner s = new Scanner (System.in);
	
	Student()
	{
		System.out.println("constructor");
	}

	static 
	{
		System.out.println("Student class--Static Block1");
		course = "JAVA";
	}

	static 
	{
		System.out.println("Student class--Static Block2");
	}
	
	void getDetails()
	{
		System.out.println("Enter Student id:");
		stId = Integer.parseInt(s.nextLine());
		System.out.println("Enter Name:");
		stName = s.nextLine();
	}
	
	void display ()
	{
		System.out.println("Student detail");
		System.out.println("---------------------------------");
		System.out.println("Student no:"+stId);
		System.out.println("Student name:"+stName);
		System.out.println("Course Name :" +course); //static member
		System.out.println("Scholl Name :" +schoolName); //static member
	}
}//Student

class Runner
{
	static{
		System.out.println("Runner -- Static block");
	}
	public static void main(String []args)
	{
		System.out.println("Runner -- Main");
		Student s1 = new Student ();
		s1.getDetails();
		Student s2 = new Student ();
		s2.getDetails();
		Student s3 = new Student ();
		s3.getDetails();
		s1.display();
		s2.display();
		s3.display();
	}
}         