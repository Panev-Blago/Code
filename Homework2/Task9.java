import java.util.Scanner;

/** Да се прочетат 2 числа от клавиатурата А и В.
Да се изведат всички числа от А до В на степен 2(разделени със
запетая).Ако някое число е кратно на 3, да се изведе съобщение че
числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
пропуснатите) стане по-голяма от 200, да се прекрати извеждането. */

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number A:");
		int a = sc.nextInt();
		System.out.println("Enter number B:");
		int b = sc.nextInt();
		int c;
		int sum = 0;
		
		if (a >= b) {	
			while (a >= b) {
				c = b*b;
				if (c%3 != 0) {
				sum += c;
				}
				b++;
				if ((c%3 == 0) && (c != 0)) {
					System.out.print("skip 3, ");
					continue;
				}
				System.out.print(c + ", ");
				if (sum > 200) {
					break;
				}
				
			}
		}
		
		else {
			while (b >= a) {
				c = a*a;
				if (c%3 != 0) {
					sum+=c;
				}
				a++;
				if ((c%3 == 0) && (c != 0)) {
					System.out.print("skip 3, ");
					continue;
				}
				System.out.print(c + ", ");
				if (sum > 200) {
					break;
				}
			}
		}
		System.out.println();
		System.out.println("The sum is " + sum + ".");
	}

}
