package by.training.task10.main;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		double start, finish;
		double step;
		
		start = ScanDouble("a >> ");
		finish = ScanDouble("b >> ");
		step = ScanDouble("h >> ");
		
		outTable(start,finish, step);

	}
	
	public static double getTg(double x)
	{
		return Math.tan(x);
	}
	
	public static void outTable(double start, double finish, double step)
	{
		System.out.println("X      F(x) ");
		
		for (double i=start; i<=finish; i+=step)
		{
			System.out.printf("%.2f   ", i);
			System.out.println(getTg(i));
		}
	}

	public static double ScanDouble(String mess) {
		double answer = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println(mess);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println(mess);
		}
		answer = sc.nextDouble();

		return answer;
	}

}
