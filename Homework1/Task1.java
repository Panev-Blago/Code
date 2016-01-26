import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		double numberA = sc.nextDouble();
		System.out.println("Enter Number B:");
		double numberB = sc.nextDouble();
		System.out.println("Enter Number C:");
		double numberC = sc.nextDouble();
		if (((numberA < numberC) && (numberC < numberB)) || ((numberA > numberC) && (numberC > numberB)) ) {
			System.out.println("The number " + numberC + " is between " + numberA + " and " + numberB + " !");
		} else {
			System.out.println("The number " + numberC + " is not between " + numberA + " and " + numberB + " !");
		}

	}


}
