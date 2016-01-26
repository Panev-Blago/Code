/** Да се състави програма, която чете от конзолата 4-цифренo
естествено число от интервала [1000.. 9999]. От това число се
формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
ново число e по-малко <, равно = или по-голямо от 2-то число. */


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
