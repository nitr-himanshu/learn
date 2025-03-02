/* 
* A class is a blueprint of an object.
* Class encapsulate properties (data) and behaviour(functions).
* Object oriented programming helps into organizing and structure the code. making it easier to understand
* maintain and extend. 
*/
import java.util.Scanner;

class App
{
    int a,b, sum;
    void readInput()
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two integer");
        a=scn.nextInt();
        b=scn.nextInt();
        scn.close();
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
        App app=new App(); //Create new object of Class App
        app.run();
    }
    
}