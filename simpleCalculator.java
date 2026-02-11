import java.util.Scanner;
public class simpleCalculator {
	public static void main(String[] args) {
		System.out.println("Hello and welcome to calculator!");
		
		Scanner input =new Scanner(System.in);

		//choosing of an operator
		System.out.println("Please select an operator: +, *, -, /, %");
		char operators = input.next().charAt(0);
		
		//Typing the number
		System.out.print("Type the first number: ");
		double numOne = input.nextDouble();
		System.out.print("Type the second number: ");
		double numTwo = input.nextDouble();
		
		//sha yung nag nag c-calculate
		switch(operators){
		case '+':
		   System.out.printf("The answer is: %.2f", numOne + numTwo);
		   break;
		case '*':
		   System.out.printf("The answer is: %.2f", numOne * numTwo);
		   break;
		case '-':
		   System.out.printf("The answer is: %.2f", numOne - numTwo);
		   break;
		case '/':
		   System.out.printf("The answer is: %.2f", numOne / numTwo);
		   break;
		case '%':
		   System.out.printf("The answer is: %.2f", numOne % numTwo);
		   break;
		default: 
		   System.out.print("Invalid operator");
		   break;		
}
}
}