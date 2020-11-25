package by.training.task05.main;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		int number;
		
		number = CheckIntValue("num >> ");
		
		System.out.println("The answer is " + isNumPerfect(number));
		

	}
	
	public static boolean isNumPerfect(int num)
	{
		int end;
		int sum;
		
		end = num/2;
		sum = 0;
		
		
		for (int i = 1; i<=end; i++)
		{
			sum += num%i == 0 ? i : 0;
		}
		
		boolean result;
		
		result = sum == num ? true : false;
		return result;
	}
	
	public static int CheckIntValue(String mess)
	{
		int result = 0;
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (result <= 0)
		{
			System.out.println(mess);
			while (!sc.hasNextInt())
			{
				sc.next();
				System.out.println(mess);
			}
			result = sc.nextInt();
		}
		
		return result;
	}

}
