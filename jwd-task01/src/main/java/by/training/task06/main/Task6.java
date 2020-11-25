package by.training.task06.main;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		int nSeconds;
		
		nSeconds = CheckIntValue("Enter seconds >> ");
		
		System.out.println(timeSeconds(nSeconds));

	}
	
	public static String timeSeconds(int n)
	{
		String result;
		
		result = (n/3600) + "h";
		n %= 3600;
		
		result += (n/60) + "m";
		n %= 60;
		
		result += n + "s";
		
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
