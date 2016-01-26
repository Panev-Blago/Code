/** Да се състави програма, която по въведени координати на 2 позиции
от шахматната дъска извежда отговор дали са оцветени в еднакъв или
различен цвят. */

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете координатите на първата позиция:");
		System.out.print("x1 = ");
		int x1 = sc.nextInt();
		System.out.print("y1 = ");
		int y1 = sc.nextInt();
		System.out.println("Въведете координатите на втората позиция:");
		System.out.print("x2 = ");
		int x2 = sc.nextInt();
		System.out.print("y2 = ");
		int y2 = sc.nextInt();
		int sum1 = x1 + y1;
		int sum2 = x2 + y2;
		if (((sum1%2 == 0) && (sum2%2 == 0)) || ((sum1%2 != 0) && (sum2%2 != 0))) {
			System.out.println("Позициите с координати [" + x1 + ", " + y1 + "] и [" + x2 + ", " + y2 + "] са с еднакъв цвят.");
		}
		else {
			System.out.println("Позициите с координати [" + x1 + ", " + y1 + "] и [" + x2 + ", " + y2 + "] са с различен цвят.");
		}
	}
		
}

	
	
