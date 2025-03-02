/* 
- No destructor in java
- Garbage collector responsible for memory management.
- finalize() method is not equivalent to destructor.
- Use of finalize() is not recommended, as it's execution is non-deterministic.
 */
import java.util.Scanner;

class App
{
    int a,b, sum;
    Scanner scn;

    App()
    {
        System.out.println("Default constructor");
        a=100;
        b=200;
        sum=0;
        scn = new Scanner(System.in);
    } // User defined default constructor

    App(int arg_a, int arg_b)
    {
        System.out.println("Parameterized constructor");
        a=arg_a;
        b=arg_b;
        sum=0;
        scn = new Scanner(System.in);
    } // User defined default constructor

    void readInput()
    {
        
        System.out.println("Enter two integer");
        a=scn.nextInt();
        b=scn.nextInt();
    } //Take user input

    void compute()
    {
        sum = a + b;
    }

    void display()
    {
        System.out.println("Value of a="+a);
        System.out.println("Value of b="+b);
        System.out.println("Value of sum="+sum);
    } //Output Method

    void run()
    {
        display(); // Values set by default constructor
        readInput();
        compute();
        display();
    }
}

class Runner
{
    public static void main(String[]args)
    {
        System.out.println("Constructor");
        
        App app=new App(); // object created using default constructor
        app.run();

        App app2=new App(700, 800); // object created using parametrised constructor
        app2.run();
    }
    
}