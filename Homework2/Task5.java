/** �� �� ������� �� ����������� 2 �����. � �� ��
������� �� ������ ������ ����� �� ��-������� �� ��-��������. */

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one number:");
		int num1 = sc.nextInt();
		System.out.println("Enter other number:");
		int num2 = sc.nextInt();
		if (num1 < num2) {
			for ( ; num1 <= num2; num1++ ) {
				System.out.println(num1);
			}
		}
		else {
			for ( ; num2 <= num1; num2++){
				System.out.println(num2);
			}
			
		}
		
	}

}
