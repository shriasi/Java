
/*Exercise 1
Implement a class called Calculation with two static methods that calculate the addition of two
numbers the subtraction of two numbers.
Implement a class called DemoApp and in the main function call the two methods directly without
creating objects.*/

/*Calculation.java*/

package Exercieses;

public class Calculation {
        int num1, num2;
	
	public static int Addition(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1 + num2);
	}

	public static int Substraction(int num1, int num2) {
		// TODO Auto-generated method stub
		return  num1 - num2 ;
	}
}

/*DemoApp.java*/
package Exercieses;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("the sum of two numbers is :" + Calculation.Addition(10, 20));
	System.out.println("the sum of two numbers is :" + Calculation.Substraction(20, 10));
	
	}
}
