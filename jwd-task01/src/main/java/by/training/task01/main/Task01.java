package by.training.task01.main;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		int number;
		number = CheckIntValue("a >> ");
		
		System.out.println("The last is " + getLastNum(number));

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
	
	public static int getLastNum(int num)
	{
		int[] arrayLast = new int[] {0, 1, 4, 9, 6, 5, 6, 9, 4, 1};
		return arrayLast[Math.abs(num%10)];
	}

}
