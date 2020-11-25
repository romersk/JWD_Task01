package by.training.task09.main;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		
		double radius;
		
		radius = ScanDouble("R >> ");
		
		System.out.println("The length is " + lengthR(radius));
		System.out.println("The square is " + squareR(radius));
		

	}
	
	public static double lengthR(double radius)
	{
		double result;
		
		result = 2 * Math.PI * radius;
		
		return result;
	}
	
	public static double squareR(double radius)
	{
		double result;
		
		result = Math.PI * radius * radius;
		
		return result;
	}
	
	public static double ScanDouble(String mess) {
		double answer = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (answer <= 0) {
			System.out.println(mess);
			while (!sc.hasNextDouble()) {
				sc.next();
				System.out.println(mess);
			}
			answer = sc.nextDouble();
		}

		return answer;
	}

}
