/** �� �� ������� ��������, ����� �� �������� ���������� �� 2 �������
�� ���������� ����� ������� ������� ���� �� �������� � ������� ���
�������� ����. */

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������������ �� ������� �������:");
		System.out.print("x1 = ");
		int x1 = sc.nextInt();
		System.out.print("y1 = ");
		int y1 = sc.nextInt();
		System.out.println("�������� ������������ �� ������� �������:");
		System.out.print("x2 = ");
		int x2 = sc.nextInt();
		System.out.print("y2 = ");
		int y2 = sc.nextInt();
		int sum1 = x1 + y1;
		int sum2 = x2 + y2;
		if (((sum1%2 == 0) && (sum2%2 == 0)) || ((sum1%2 != 0) && (sum2%2 != 0))) {
			System.out.println("��������� � ���������� [" + x1 + ", " + y1 + "] � [" + x2 + ", " + y2 + "] �� � ������� ����.");
		}
		else {
			System.out.println("��������� � ���������� [" + x1 + ", " + y1 + "] � [" + x2 + ", " + y2 + "] �� � �������� ����.");
		}
	}
		
}

	
	
