package jp.calendar;

import java.util.Scanner;

public class Prompt {

	public int parseDay(String week) {
		if (week.equals("SU"))
			return 0;
		else if (week.equals("MO") )
			return 1;
		else if (week.equals("TU"))
			return 2;
		else if (week.equals("WE"))
			return 3;
		else if (week.equals("TH"))
			return 4;
		else if (week.equals("FR"))
			return 5;
		else if (week.equals("SA"))
			return 6;
		else
			return 0;

	}

	public void runPrompt() {
		Scanner in = new Scanner(System.in);
		int weekday, month = 0;
		String str_weekday;
		Calendar calendar = new Calendar();
		System.out.println("년을 입력하세요.");
		System.out.print("YEAR> ");
		int year = in.nextInt();

		while (month != -1) {
			System.out.println("월을 입력하세요.");
			System.out.print("MONTH> ");
			month = in.nextInt();
			System.out.println("첫번째 요일을 입력하세요.	(	SU	MO	TU	WE	TH	FR	SA	)");
			System.out.print("WEEKDAY> ");
			str_weekday = in.next();
			weekday = parseDay(str_weekday);
			if (month == -1)
				break;
			else if (month < 1 || month > 12) {
				System.out.printf("유효하지 않은 숫자입니다. (1~12 입력)\n");
				continue;
			} else
				calendar.printCalendar(year, month, weekday);
		}
		System.out.printf("종료");
		in.close();
	}

	public static void main(String[] args) {
		Prompt prompt = new Prompt();
		prompt.runPrompt();

	}
}
