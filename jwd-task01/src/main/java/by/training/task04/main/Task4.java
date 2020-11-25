package by.training.task04.main;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int numA, numB, numC, numD;

		numA = CheckIntValue("A >> ");
		numB = CheckIntValue("B >> ");
		numC = CheckIntValue("C >> ");
		numD = CheckIntValue("D >> ");
		
		System.out.println("The answer is " + getResultOfNum(numA, numB, numC, numD));
		
	}
	
	public static boolean getResultOfNum(int a, int b, int c, int d)
	{
		boolean answer;
		answer = false;
		
		if ( ( ( (a*b)%2 == 0) && ( (c*d)%2 == 0) ) ||  ( ( (a*c)%2 == 0) && ( (b*d)%2 == 0) ) )
		{
			answer = true;
		}
		return answer;
	}
	
	public static int CheckIntValue(String mess)
	{
		int result;
		
		System.out.println(mess);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt())
		{
			sc.next();
			System.out.println(mess);
		}
		result = sc.nextInt();
		
		return result;
	}

}
