package jp.calendar;

import java.time.Month;
import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		if (month < 1 || month > 12)
			return 0;
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar() {
		System.out.println("일	월	화	수	목	금	토");
		System.out.println("----------------------------------------------------");
		System.out.println("1	2	3	4	5	6	7");
		System.out.println("8	9	10	11	12	13	14");
		System.out.println("15	16	17	18	19	20	21");
		System.out.println("22	23	24	25	26	27	28");
	}

	public static void main(String[] args) {
		String prompt = ">";
		Scanner in = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 0;
		while(month != -1 ) {
			System.out.println("월을 입력하세요.");
			System.out.print(prompt);
			month = in.nextInt();
			if (cal.getMaxDaysOfMonth(month) != 0)
				System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
			else if(month == -1) 
				break;
			else {
				System.out.printf("유효하지 않은 숫자입니다. (1~12 입력)\n");
				continue;
			}
		} 
		
		cal.printSampleCalendar();
		in.close();
	}
}
