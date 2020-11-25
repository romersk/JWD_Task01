package by.training.task03.main;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		double square;
		
		square = ScanDouble("Enter square >> ");
		System.out.println("The square of this inner shape is always 2 times smaller = " + getSquare(square));

	}

	public static double getSquare(double square)
	{
		return square/2;
	}
	
	public static double ScanDouble(String mess)
	{
		double answer = 0;
		
		System.out.println(mess);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(answer <= 0)
		{
			while (!sc.hasNextDouble())
			{
				sc.next();
				System.out.println(mess);
			}
			answer = sc.nextDouble();
		}
		
		return answer;
	}
	
}
