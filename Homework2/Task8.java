/** По зададено число n, да се изведе на екрана таблица.
 * Въведете n:
4
3333
5555
7777
9999 */

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter one number: ");
		int num = sc.nextInt();
		int x = num-1;
		for (int row = 1; row <= num; row++){
			for (int col = 1; col <= num; col++) {
				System.out.print(x);
			}
			System.out.println();
			x+=2;
		}
	}

}
