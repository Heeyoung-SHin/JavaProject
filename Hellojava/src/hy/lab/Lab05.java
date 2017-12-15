package hy.lab;

import java.util.Scanner;

public class Lab05 {
	public static void main(String[] args) {
		// 4-6
		System.out.print("현재 월을 입력하세요.>");

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");

		}

		// 4-7
		System.out.println("가위1,바위2,보3 중 하나를 입력하세요.>");
		Scanner sc2 = new Scanner(System.in);

		int user = sc2.nextInt();
		int com = (int) (Math.random() * 3) + 1;

		System.out.println("당신은" + user + "입니다.");
		System.out.println("컴은" + com + "입니다.");

		switch (user - com) {
		case 2:
		case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1:
		case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;
		}

		// 4-8
		System.out.println("당신의 주민번호를 입력하세요.>");

		Scanner sc3 = new Scanner(System.in);

		String regNo = sc3.nextLine();

		char gender = regNo.charAt(7);

		switch (gender) {
		case '1':
		case '3':
			System.out.println("Man");
			break;
		case '2':
		case '4':
			System.out.println("Woman");
			break;
		default:
			System.out.println("다시 입력해주세요ㅠㅠ");
		}

	}
}
