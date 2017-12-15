package hy.lab;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Lab07 {
	public static void main(String[] args) throws IOException {
		// 22번 -윤년 여부 확인
		// 현재 연도가 400으로 나눠 떨어지거나
		// 현재 연도가 4로 나눠 떨어지지만
		// 100으로는 나눠 떨어지지 않음

		GregorianCalendar gc = new GregorianCalendar();

		String welCome = "윤년 확인할 연도를 입력하세요";
		String fmt1 = "%d년은 윤년입니다.";
		String fmt2 = "%d년은 윤년이 아닙니다.";

		Scanner sc = new Scanner(System.in);
		System.out.println(welCome);

		int year = sc.nextInt();

		if (gc.isLeapYear(year))
			System.out.printf(fmt1, year);
		else
			System.out.printf(fmt2, year);

		gc.isLeapYear(2011);
		System.out.println(gc.isLeapYear(2011));

		// 22번
		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
			System.out.printf("%d는 윤년입니다.", year);
		else
			System.out.printf("%d는 윤년이 아닙니다.\n", year);

		// 23번- 복권 발행 프로그램
		// 특정범위를 포함하는 난수 생성
		// 정수난수값 % ((마지막값 - 시작값)+1)+시작값
		// 복권 숫자 범위 : 100-999
		// lotto : 657, lucky : 452 = 1개 일치
		// lotto : 657, lucky : 524 = 1개 일치

		int rand = (int) (Math.random() * 100000);
		int lotto = rand % ((999 - 100) + 1) + 100;

		System.out.println("Lotto " + lotto);

		sc = new Scanner(System.in);

		String lucky = sc.nextLine();
		System.out.println("Lucky " + lucky);

		// 문자 하나씩 추출
		char lucky1 = lucky.charAt(0);
		char lucky2 = lucky.charAt(1);
		char lucky3 = lucky.charAt(2);

		char lotto1 = ("" + lotto).charAt(0);
		char lotto2 = ("" + lotto).charAt(1);
		char lotto3 = ("" + lotto).charAt(2);

		// 비교
		int match = 0;
		// if (lotto1 == lucky1 || lotto1 == lucky2 || lotto1 == lucky3)
		// ++match;
		// if (lotto2 == lucky1 || lotto2 == lucky2 || lotto2 == lucky3)
		// ++match;
		// if (lotto3 == lucky1 || lotto3 == lucky2 || lotto3 == lucky3)
		// ++match;

		String lotto4 = "" + lotto;
		int size = lotto4.length();

		for (int i = 0; i < size; ++i)
			for (int j = 0; j < size; ++j)
				if (lucky.charAt(i) == lotto4.charAt(j))
					++match;

		System.out.println(match);

		String msg = "돈 낭비 ^_^";
		switch (match) {
		case 3:
			msg = "모두 일치! 1등!";
			break;
		case 2:
			msg = "2개 일치! 2등!";
			break;
		case 1:
			msg = "1개 일치! 3등!";
			break;
		}
		System.out.println(msg);

		// int aaa= scan.next().charAt(0)

		// System.out.println(lotto.charAt(0));

		// double Lotto = Math.random();

		// charAt();

		// 24번
		// 출력할 단을 입력 받아서 구구단 형식 출력

		String start = "출력 할 단을 입력해주세요.";

		// Scanner sc1 = new Scanner(System.in); 새로운 변수로 선언해도 무방.

		sc = new Scanner(System.in);
		System.out.println(start);
		int num = sc.nextInt();

		String fmt = "%2d * %2d = %3d \n"; // 자릿수 지정.
		for (int i = 1, j = num; i <= 9; i++)
			System.out.printf(fmt, j, i, j * i);

		// 25번

		// System.in.read();
		System.out.println("소문자 알파벳을 대문자로 바꿔드립니다.!");
		System.out.println("소문자 알파벳을 하나 입력하세요.");
		System.in.read();
		int ch = System.in.read();

		// 소문자 이외의 문자가 입력되면
		// 경고메세지 출력
		if (ch < 97 || ch > 122)
			System.out.println("잘못입력하셨습니다!");
		else {
			// 소문자를 대문자로 변환하기 위해
			// 입력한 문자에서 32만큼 빼고 처리

			ch = ch - 32;
			System.out.println((char) ch);
		}

		// 26번
		int num2 = (int) (Math.random() * 100) + 1;
		sc = new Scanner(System.in);// 키보드로 데이터 입력받을 준비

		while (true) {
			int num1 = sc.nextInt(); // 정수 입력 받음

			if (num1 > num2)
				System.out.println("숫자가 큽니다.");
			else if (num1 < num2)
				System.out.println("추측한 숫자가 작습니다.");
			else if (num1 == num2) {
				System.out.println("빙고!숫자가 맞습니다.");
				break;
			}

			System.out.println("num2는" + num2);
		}
		// 27번
		int number = 0;
		int sum = 0;

		while (number < 20) {
			number++;
			sum += number;
			if (sum >= 100)
				break;
		}
		fmt = "num : %d, sum : %d\n";
		System.out.printf(fmt, number, sum);

		// 28번

		while (number < 20) {
			number++;
			if (number == 10 || number == 11)
				continue;
			sum += number; // continue를 만나면 다시 조건문으로 올라가버림.
		}
		fmt = "num : %d, sum : %d\n";
		System.out.printf(fmt, number, sum);

		// 30번

		fmt = "             Multiplication Table\n";
		fmt += "        1    2    3    4    5    6    7    8    9 \n";
		fmt += "--------------------------------------------------\n";

		System.out.println(fmt);
		for (int i = 1; i <= 9; ++i) {
			fmt = "%d  |  %3d   %2d   %2d   %2d   %2d   %2d   %2d   %2d   %2d \n";
			System.out.printf(fmt, i, i * 1, i * 2, i * 3, i * 4, i * 5, i * 6, i * 7, i * 8, i * 9);
		}

		fmt = "             Multiplication Table\n";
		fmt += "        1    2    3    4    5    6    7    8    9 \n";
		fmt += "--------------------------------------------------\n";

		System.out.println(fmt);
		for (int i = 1; i <= 9; ++i) {
			System.out.printf("%d  |  %3d", i, i);
			for (int j = 2; j <= 9; ++j) {
				System.out.printf("   %2d", i * j);
			}
			System.out.print("\n");
		}
	}
}
