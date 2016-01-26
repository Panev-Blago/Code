import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a1:");
		double a1 = sc.nextDouble();
		System.out.println("Enter a2:");
		double a2 = sc.nextDouble();
		System.out.println("Enter a3:");
		double a3 = sc.nextDouble();
		double newA1;
		newA1 = a2;
		a2 = a3;
		a3 = a1;
		a1 = newA1;
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println("a3 = " + a3);
	}

}
