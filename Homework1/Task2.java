import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Integer
		System.out.println("Enter Operand 1 (Integer):");
		int op1 = sc.nextInt();
		System.out.println("Enter Operand 2 (Integer):");
		int op2 = sc.nextInt();
		int sum = op1 +op2;
		int subtraction = op1 - op2;
		int multiplication = op1 * op2;
		int modulus = op1 % op2;
		int division = op1 / op2;
		System.out.println("Operand 1 + Operand 2 = " + op1 + " + " + op2 + " = " + sum);
		System.out.println("Operand 1 - Operand 2 = " + op1 + " - " + op2 + " = " + subtraction);
		System.out.println("Operand 1 * Operand 2 = " + op1 + " * " + op2 + " = " + multiplication);
		System.out.println("Operand 1 % Operand 2 = " + op1 + " % " + op2 + " = " + modulus);
		System.out.println("Operand 1 / Operand 2 = " + op1 + " / " + op2 + " = " + division);
		
		// Floating Point
		System.out.println("Enter Number A (Floating Point):");
		double numberA = sc.nextDouble();
		System.out.println("Enter Number B (Floating Point):");
		double numberB = sc.nextDouble();
		double sumDouble = numberA + numberB;
		double subDouble = numberA - numberB;
		double multiDouble = numberA * numberB;
		double modulDouble = numberA % numberB;
		double divDouble = numberA / numberB;
		System.out.println("Number A + Number B = " + numberA + " + " + numberB + " = " + sumDouble);
		System.out.println("Number A - Number B = " + numberA + " - " + numberB + " = " + subDouble);
		System.out.println("Number A * Number B = " + numberA + " * " + numberB + " = " + multiDouble);
		System.out.println("Number A % Number B = " + numberA + " % " + numberB + " = " + modulDouble);
		System.out.println("Number A / Number B = " + numberA + " / " + numberB + " = " + divDouble);
	}

}
