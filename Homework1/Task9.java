/** �� �� ������� ��������, ����� ���� �� ��������� 2 ����������
���������� ����� a,b.
���������� �� ������ � ��������� ���� ���������� ����� ��
�������������� �� ����� ����� � �����, ����� � ������ �����.
������ �����: a,b - ���������� ����� �� ��������� [10..99]. */

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2-number integer between 10 and 99:");
		byte a = sc.nextByte();
		System.out.println("Enter 2-number integer from 10 to 99:");
		byte b = sc.nextByte();
		int c = a * b;
		int cc = c%2;
		int lastC = ((c%1000)%100)%10;
		System.out.println(lastC);
		
		if (cc == 0) {
			System.out.println(c + " and " + lastC + " are even.");
		} else {
			System.out.println(c + " and " + lastC + " are odd.");
		}
			
		}
	}

