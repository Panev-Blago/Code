/** Започвайки от 3, да се изведат на екрана първите n
числа които се делят на 3. Числата да са разделени със запетая. */


import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
		System.out.print("Enter one positive number -> n = ");
		n = sc.nextInt();
		}
		while (n <= 0);
		
		int x = 3;
		while (n >= 1) {
			if (x%3 == 0) {
				System.out.print(x + ", ");
			}
			n--;
			x+=3;
		}
		System.out.println("\b");
	}

}
