package satvik142;
import java.util.*;

public class Calc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the operation");
		char operation = s.next().charAt(0);
		System.out.println("Enter the 2 operands");
		int a = s.nextInt();
		int b = s.nextInt();
		int op;
		
		switch(operation)
		{
			case '+': op = a+b;
			System.out.println("Result of addition is: " + op);
					  break;
			case '-': op = a-b;
			System.out.println("Result of subtraction is: " + op);
						break;
			case '*': 
			case 'x':
			case 'X': op = a*b;
			System.out.println("Result of multiplication is: " + op);
						break;
			case '/':
			case '\\': op = a/b;
			System.out.println("Result of division is: " + op);
						break;
			case '%': op = a%b;
			System.out.println("Result of modulus is: " + op);
						break;
			default : 
			System.out.println("Enter a valid operator");		
		
		}

	}

}
