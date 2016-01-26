import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numberA = sc.nextDouble();
		double numberB = sc.nextDouble();
		if (numberA >= numberB) {
			System.out.println(numberB);
			System.out.println(numberA);
		} else {
			System.out.println(numberA);
			System.out.println(numberB);
		}
	}

}
