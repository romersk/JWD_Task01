package by.training.task08.main;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		double xArg;

		xArg = ScanDouble("x >> ");

		System.out.println("F(x) = " + funcX(xArg));

	}

	public static double funcX(double x) {
		double result;

		result = x < 3 ? 1.0 / (Math.pow(x, 3) - 6) : 3 * x - x * x + 9;

		return result;
	}

	public static double ScanDouble(String mess) {
		double answer = 0;

		System.out.println(mess);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println(mess);
		}
		answer = sc.nextDouble();

		return answer;
	}

}
