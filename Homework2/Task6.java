/**  Да се прочете число от екрана(конзолата) и да се
изведе сбора на всички числа между 1 и въведеното число. */

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 1;
		System.out.println("Enter one number:");
		int num = sc.nextInt();
		if (num > 0) {
			while (num > 1){
				sum += num;
				num--;
			}
		}
		else {
			while (num < 1) {
				sum += num;
				num++;
			}
		}
		System.out.print(sum);	
	}

}
