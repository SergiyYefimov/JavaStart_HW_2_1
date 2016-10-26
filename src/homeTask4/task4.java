package homeTask4;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		int mass[];
		int i;
		int max = 0;
		mass = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers, with spaces: ");
		for (i = 0; i < 4; i++) {
			mass[i] = input.nextInt();
			if (i == 0) {
				max = mass[i];
			}
			if (max < mass[i]) {
				max = mass[i];
			}
		}
		input.close();
		System.out.print("Max number is: "+max);
	}

}
