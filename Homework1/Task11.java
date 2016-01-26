/** Съставете програма, която по дадено трицифренo число проверява
дали числото се дели на всяка своя цифра. Във въведеното число да
няма цифра 0. */

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3-number integer (without 0):");
		int num = sc.nextInt();
		int n = num/100;
		int u = (num%100)/10;
		int m = (num%100)%10;
		// System.out.println(n + " " + u + " " + m);
		if (num%n == 0) {
			System.out.println(num + " se deli na " + n);	
		}
		else {
			System.out.println(num + " ne se deli na " + n);
		}
		if (num%u == 0) {
			System.out.println(num + " se deli na " + u);
		}
		else {
			System.out.println(num + " ne se deli na " + u);			
		}
		if (num%m == 0) {
			System.out.println(num + " se deli  na " + m);
		}
		else {
			System.out.println(num + " ne se deli na " + m);
		}
	}

}
