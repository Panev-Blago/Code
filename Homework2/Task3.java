/** ƒа се изведат на екрана всички нечетни числа от -10
до 10. */


public class Task3 {

	public static void main(String[] args) {
		int num = -10;
		while (num <= 10) {
			if (num%2 != 0) {
				System.out.println(num);
			}
			num++;
		}
	}

}
