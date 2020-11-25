package by.training.task07.main;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		double xPointA, yPointA;
		double xPointB, yPointB;

		xPointA = ScanDouble("X1 >> ");
		yPointA = ScanDouble("Y1 >> ");

		xPointB = ScanDouble("X2 >> ");
		yPointB = ScanDouble("Y2 >> ");

		System.out.println(pointDist(xPointA, yPointA, xPointB, yPointB) + " is the closest point");

	}

	public static String pointDist(double x1, double y1, double x2, double y2) {
		String result;

		double distA;
		double distB;

		distA = Math.sqrt(x1 * x1 + y1 * y1);
		distB = Math.sqrt(x2 * x2 + y2 * y2);

		result = distA < distB ? "A" : "B";

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
