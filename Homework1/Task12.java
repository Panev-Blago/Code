/** ¬исокосни години са всички години кратни на 4 с изключени€
столети€та, но без столети€ кратни на 400, т.е. 1900 не е високосна,
но 1600 и 2000 са високосни.
—ъставете програма, ко€то по дадени ден, месец, година отпечатва
следващата дата.
¬ходни данни: три числа за ден, месец, година. */

import java.util.Scanner;

public final class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dayNumber, monthNumber, yearNumber;
		do {
		System.out.println("Insert day:");
		dayNumber = sc.nextInt();
		}
		while ((dayNumber <= 0) || (dayNumber > 31));
		do {
			System.out.println("Insert month:");
			monthNumber = sc.nextInt();
		}
		while ((monthNumber <= 0) || (monthNumber > 12));
		do {
			System.out.println("Insert year:");
			yearNumber = sc.nextInt();	
		}
		while (yearNumber <= 0);
		boolean leapYear = (((yearNumber % 4 == 0) && (yearNumber % 100 != 0)) || (yearNumber % 400 == 0));
		// check year
		if (leapYear == true){
			System.out.println(yearNumber + " is a leap year.");
		}
		else {
			System.out.println(yearNumber + " isn`t a leap year. ");
		}
		boolean correctData = true;
		if ((dayNumber >= 29) && (monthNumber == 2) && (leapYear == false)) {
			correctData = false;
		}
		else 
		if ((dayNumber > 30) && (monthNumber == 2) && (leapYear == true)) {
			correctData = false;
		}
		else
		if ((dayNumber == 31) && ((monthNumber == 4) || (monthNumber == 6) || (monthNumber == 9) || (monthNumber == 11))) {
			correctData = false;
			
		}
		
		if ((dayNumber == 28) && (monthNumber == 2) && (leapYear == false)) {
			dayNumber = 1;
			monthNumber ++;
		}
		else
		if ((dayNumber == 29) && (monthNumber == 2) && (leapYear == true)) {
			dayNumber = 1;
			monthNumber ++;
		}
		else
		if ((dayNumber == 30) && ((monthNumber == 4) || (monthNumber == 6) || (monthNumber == 9) || (monthNumber == 11))) {
			dayNumber = 1;
			monthNumber ++;	
		}
		else
		if ((dayNumber == 31) && (monthNumber != 12)) {
			dayNumber = 1;
			monthNumber ++;
		}
		else 
		if ((dayNumber == 31) && (monthNumber == 12)) {
			dayNumber =1;
			monthNumber = 1;
			yearNumber ++;
		}
		else {
			dayNumber ++;
		}
		if (correctData == true) {
			System.out.println("The next day is: " + dayNumber + ", " + monthNumber + ", " + yearNumber + ".");
		}
		else {
			System.out.println("Insert correct data.");
		}
		
	}

}
