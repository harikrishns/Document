package Arith;
import java.util.Scanner;

public class ArithmaticOperations {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int x=sc.nextInt();
	System.out.println("Enter second number");
	int y=sc.nextInt();
	//perform arithmetic operations.
	int sum             =x+y;
	int subtraction     =x-y;
	int product         =x*y;
	int quotient        =x/y;
	int modulo          =x%y;
	//print result to console.
	System.out.println("sum       :"    +sum);
	System.out.println("difference:"    +subtraction);
	System.out.println("product   :"    +product     );
	System.out.println("quotient  :"    +quotient);
	System.out.println("modulo    :"    +modulo);

	}

}
