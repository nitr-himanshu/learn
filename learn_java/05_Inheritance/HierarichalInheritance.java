
/* 
In Multilevel inheritance there exist one base class one derived class and mutiple intermediate base class.
										BaseClass
										|
										|
				-----------------------------------------------------------------
				|						|						|				|
				|						|						|				|
				v						v						v				v
				DerivedClass1			DerivedClass2			DerivedClass3   DerivedClass(n)
*/
import java.util.Scanner;

class BaseClass {
	int baseClassNum;

	void displayBaseClass() {
		System.out.println("displayBaseClass");
		System.out.println("Value of baseClassNum =" + baseClassNum);
	}
}

class DerivedClass extends BaseClass {
	int derivedClassNum;

	void displayDerivedClass() {
		System.out.println("displayDerivedClass");
		System.out.println("Value of derivedClassNum =" + derivedClassNum);
		System.out.println("Value of baseClassNum =" + baseClassNum);
	}
}

class DerivedClass1 extends BaseClass {
	int derivedClass1Num;

	void displayDerivedClass1() {
		System.out.println("displayDerivedClass1");
		System.out.println("Value of derivedClassNum1 =" + derivedClass1Num);
		System.out.println("Value of baseClassNum =" + baseClassNum);
	}
}

class HierarchicalInheritance {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DerivedClass obj1 = new DerivedClass();
		DerivedClass1 obj2 = new DerivedClass1();
		
		System.out.println("Enter value for Base class");
		obj1.baseClassNum = scn.nextInt();
		System.out.println("Enter value for Derived class");
		obj1.derivedClassNum = scn.nextInt();
		obj1.displayDerivedClass();
		
		System.out.println("Enter value for Base class");
		obj2.baseClassNum = scn.nextInt();
		System.out.println("Enter value for Derived class1");
		obj2.derivedClass1Num = scn.nextInt();
		obj2.displayDerivedClass1();
		
		scn.close();
	}
}