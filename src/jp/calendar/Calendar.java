package jp.calendar;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printCalendar(int month) {
		System.out.printf("		<<%4d년%3d월>>\n",2022,month);
		System.out.println("SU	MO	TU	WE	TH	FR	SA");
		System.out.println("----------------------------------------------------");
		int i, max, count = 1;
		max = getMaxDaysOfMonth(month);

		while (count < max) {
			for (i = 0; i < 7; i++) {
				System.out.printf("%d	", count);
				if (count == max)
					break;
				count++;
			}
			System.out.print("\n");
		}
	}

}
