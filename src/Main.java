import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 18;
		int b = 15;
		maxNumber(a, b);
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter three numbers");
		System.out.println("Enter number i:");
		int i = input.nextInt();
		System.out.println("Enter number j:");
		int j = input.nextInt();
		System.out.println("Enter number k:");
		int k = input.nextInt();
		maxNumber(i, j, k);

	}

	private static void maxNumber(int i, int j, int k) {
		if (i > j && i > k) {
			System.out.println("Max Number is: " + i);
		} else if (j > i && j > k) {
			System.out.println("Max Number is: " + j);
		} else {
			System.out.println("Max Number is: " + k);
		}
	}

	private static void maxNumber(int a, int b) {
		if (a > b) {
			System.out.print("Max Number is: " + a);
		} else if (a == b) {
			System.out.print("a = b: " + a);
		} else {
			System.out.print("Max Number is: " + b);
		}

	}
}
