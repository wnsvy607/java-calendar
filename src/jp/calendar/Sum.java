package jp.calendar;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1, s2;
		int a, b;
		System.out.println("두 수를 입력하세요.");
		// 내가 만든 풀이
//		a = in.nextInt();
//		b = in.nextInt();
//		System.out.println("두 수의 합은 " + (a + b) + "입니다.");
		
		//강의 풀이 (문자열로 입력받고 정수형으로 전환)
		s1 = in.next();
		s2 = in.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println("두 수의 합은 " + (a + b) + "입니다.");
		
		
		in.close();
	}
}
