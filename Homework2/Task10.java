/** �������� ����� �� ������������ � ���������� ���� �
������. ������ ����� � ���� ����� �� ���� ���� �� 1 � �� ����
��. */

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one number: ");
		int num  = sc.nextInt();
		boolean isPrime = true;
		for (int x = 2; x <= num/2; x++) {
			if (num % x == 0) {
				System.out.println("The number is not prime.");
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println("The number is prime.");
		}

	}

}
