/** Въведено е трицифрено естествено число от вида abc.
Трябва да се провери дали:
ако a = b = c - Изход: цифрите са равни;
ако a>b>c - Изход: цифрите са във възходящ ред;
ако a<b<c цифрите са в низходящ ред;
и изход: цифрите са ненаредени, за неописаните случаи.
Да се състави програма, която извежда резултата от проверката за
наредба на цифрите в числото. */

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one 3-numbers-integer:");
		int abc = sc.nextInt();
		int a = abc / 100;
		int b = (abc % 100) / 10;
		int c = (abc % 100) % 10;
		if ((abc < 100) || (abc > 999)) {
			System.out.println("Incorrect data.");
		} else 
		if (((a == b) && (a == c)) && (b == c)) {
			System.out.println("The numbers are equal.");
		} else 
		if (((a > b) && (a > c)) && (b > c)) {
			System.out.println("descending");
		} else 
		if (((a < b) && (a < c)) && (b < c)) {
			System.out.println("ascending");
		} else {
			System.out.println("The numbers are misplaced.");
		}

	}

}
