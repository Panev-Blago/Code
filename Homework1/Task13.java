/** Да се състави програма, която да отгатне колко е студено/топло по
въведената температура t в градус Целзий.
Температурните интервали са:
под -20 ледено студено;
между 0 и -20 - студено;
между 15 и 0 - хладно;
между 25 и 15 - топло;
над 25 – горещо.
Входни данни: цяло число от интервала [-100..100]. */

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter t (from -100 to 100):");
		int t = sc.nextInt();
		if ((t >= -100) && (t <= -20)) {
			System.out.println("ice cold");
		}
		if ((t > -20) && (t <= 0)) {
			System.out.println("cold");
		}
		if ((t > 0) && (t <= 15)) {
			System.out.println("cool");
		}
		if ((t > 15) && (t <= 25)) {
			System.out.println("warm");
		}
		if ((t > 25) && (t <= 100)) {
			System.out.println("hot");
		}
		if ((t < -100) || (t > 100)){
			System.out.println("Incorrect data.");
		}
	}

}
