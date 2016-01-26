/* Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
3 литра и ги ползвате едновременно.
Да се състави програма, която по даден обем извежда как ще прелеете
течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
кофите. Кофите не могат да се ползват с частично количество вода.
Входни данни: естествено число от интервала [10..9999]. */

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter tank: ");
		int tank = sc.nextInt();
		int buckets = tank/5;
		//double bucket2L = buckets * 0.4;
		//double bucket3L = buckets * 0.6;
		System.out.println(buckets + " times 2L bucket \n" + buckets + " times 3L bucket");
		int addBucket = tank%5;
		switch (addBucket){
		case 1:
			System.out.println("and 2L bucket add! \nThe tank will overflow with 1 liter.");
			break;
		case 2:
			System.out.println("and 2L bucket add!");	
			break;
		case 3:
			System.out.println("and 3L bucket add!");
			break;
		case 4:
			System.out.println("and 2L and 3L buckets add! \nThe tank will overflow with 1 liter.");
			break;
		}

	}

}
