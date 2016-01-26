/** Да се състави програма, която въвежда естествено число от интервала
[0..24].
Програмата да изведе съответстващо съобщение съобразно въведения
час.
Периодите са:
[18..4] - Добър вечер;
[4..9] - Добро утро;
[9..18] - Добър ден */

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
