/** �� �� ������� ��������, ����� ���� �� ��������� 4-������o
���������� ����� �� ��������� [1000.. 9999]. �� ���� ����� ��
�������� 2 ���� 2-������� �����. ������� ����� �� ������� �� 1-��
� 4-�� ����� �� ���������� �����. ������� ����� �� ������� �� 2-�a -
3-�� ����� �� ���������� �����. ���� �������� �� �� ������ ���� 1-��
���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����. */


import java.util.Scanner; 


public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4-number integer between 1000 and 9999:");
		int abcd = sc.nextInt();
		int a = (abcd/1000)*10;
		int d = ((abcd%1000)%100)%10;
		int ad = a + d;
		int bc = (abcd%1000)/10;
		if (ad > bc) {
			System.out.println(ad + " > " + bc);
		} else {
			if (ad == bc) {
				System.out.println(ad + " = " + bc);
			} else {
				System.out.println(ad + " < " + bc);
			}
		}
	}

}
