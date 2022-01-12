package jp.calendar;

import java.util.Scanner;

public class Prompt {

	public void runPrompt() {
		Scanner in = new Scanner(System.in);
		Calendar calendar = new Calendar();

		int month = 0;
		while (month != -1) {
			System.out.println("월을 입력하세요.");
			System.out.print(">");
			month = in.nextInt();
			if (month == -1)
				break;
			else if (month < 1 || month > 12) {
				System.out.printf("유효하지 않은 숫자입니다. (1~12 입력)\n");
				continue;
			} else
				calendar.printCalendar(month);
		}
		System.out.printf("종료");
		in.close();
	}

	public static void main(String[] args) {
		Prompt prompt = new Prompt();
		prompt.runPrompt();

	}
}
