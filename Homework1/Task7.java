/** Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
пари (число с плаваща запетая), дали съм здрав – булев тип.
Съставете програма, която взема решения на базата на тези данни по
следния начин:
- ако съм болен, няма да излизам
- ако имам пари, ще си купя лекарства
- ако нямам – ще стоя вкъщи и ще пия чай
- ако съм здрав, ще отида на кино с приятели
- ако имам по-малко от 10 лв, ще отида на кафе.
Полученото решение покажете като съобщение в конзолата. */

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte hour;
		double money;
		do {
		System.out.println("What`s the time?");
		hour = sc.nextByte();
		}
		while ((hour < 0) || (hour > 24)); 
		do {
		System.out.println("How much money you have?");
		money = sc.nextDouble();
		}
		while (money <0);
		System.out.println("Are you healthy (true or false) ?");
		boolean health = sc.nextBoolean();
		
		if ((health == false) && (money == 0)) {
			System.out.println("Stay at home and drink tee!");
		} else 
			if ((health == false) && (money > 0)) {
			System.out.println("Buy pills!");
		} else 
			if ((health == true) && (money >= 10)) {
			System.out.println("Go to cinema with friends!");
		} else 
			if ((health == true) && (money < 10) && (money > 0)) {
			System.out.println("Go to coffee!");
		}
	}
}
