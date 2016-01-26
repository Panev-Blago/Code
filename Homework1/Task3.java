import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert Number A:");
		double numberA = sc.nextDouble();
		System.out.println("Insert Number B: ");
		double numberB = sc.nextDouble();
		double numberC = numberA;
		numberA = numberB;
		numberB = numberC;
		System.out.println("New Number A is: " + numberA);
		System.out.println("New Number B is: " + numberB);
	}

}
