/** �� �� ������� ��������, ����� ������� ���������� ����� �� ���������
[0..24].
���������� �� ������ ������������� ��������� ��������� ���������
���.
��������� ��:
[18..4] - ����� �����;
[4..9] - ����� ����;
[9..18] - ����� ��� */

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert an hour from 0 to 24:");
		byte hour = sc.nextByte();
		if ((hour < 0) || (hour > 24)) {
			System.out.println("Incorect Data");
		}
		if ((hour >= 4) && (hour < 9)) {
			System.out.println("Good morning");
		}
		if ((hour >= 9) && (hour <= 18)) {
		    System.out.println("Good afternoon");	
		}
		if (((hour >= 0) && (hour < 4)) || ((hour > 18) && (hour <= 24))) {
			System.out.println("Good evening");
		}
	}

}
