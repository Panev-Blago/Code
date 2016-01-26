import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		double numA = sc.nextDouble();
		System.out.println("Enter Number B:");
		double numB = sc.nextDouble();
		System.out.println("Enter Number C:");
		double numC = sc.nextDouble();
		if (((numA >= numB) && (numA >= numC)) && (numB >= numC)) {
			System.out.println(numA);
			System.out.println(numB);
			System.out.println(numC);
		} else {
			if (((numA >= numB) && (numA >= numC)) && (numC >= numB)) {
				System.out.println(numA);
				System.out.println(numC);
				System.out.println(numB);
			}
			if (((numB >= numA) && (numB >= numC)) && (numA >= numC)) {
				System.out.println(numB);
				System.out.println(numA);
				System.out.println(numC);
			}
			if (((numB >= numA) && (numB >= numC)) && (numC >= numA)) {
				System.out.println(numB);
				System.out.println(numC);
				System.out.println(numA);
			}
			if (((numC >= numA) && (numC >= numB)) && (numA >= numB)) {
				System.out.println(numC);
				System.out.println(numA);
				System.out.println(numB);
			}
			if (((numC >= numA) & (numC >= numB)) & (numB >= numA)) {
				System.out.println(numC);
				System.out.println(numB);
				System.out.println(numA);
			}
		}

	}

}
