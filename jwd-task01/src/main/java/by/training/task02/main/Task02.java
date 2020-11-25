package by.training.task02.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		int year;
		int month;

		year = ScanYear("Enter an year >>  ");
		month = ScanMonth("Enter a month >> ");
		
		System.out.println("Days in this month = " + getDaysInMonth(month, year));
	}
	
	public static int getDaysInMonth(int month, int year)
	{
		int[] arrDaysInMonth = new int[] {31, 28,  31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (year%4 == 0 && month == 2)
		{
			return (arrDaysInMonth[month-1]+1);
		}
		return arrDaysInMonth[month-1];
	}
	
	public static int ScanYear(String mess)
	{
		int answer = -1;
		
		System.out.println(mess);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(answer < 0)
		{
			while (!sc.hasNextInt())
			{
				sc.next();
				System.out.println(mess);
			}
			answer = sc.nextInt();
		}
		
		return answer;
	}
	
	public static int ScanMonth(String mess)
	{
		int answer = 0;
		
		System.out.println(mess);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(answer <= 0 || answer > 12)
		{
			while (!sc.hasNextInt())
			{
				sc.next();
				System.out.println(mess);
			}
			answer = sc.nextInt();
		}
		
		return answer;
	}

}
