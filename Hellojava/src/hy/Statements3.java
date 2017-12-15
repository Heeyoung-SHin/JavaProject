package hy;

import java.util.Scanner;

public class Statements3 {
	public static void main(String[] args) {
		// 반복문 while

		int i = 1; // 초기식
		while (i <= 5) { // 조건식
			System.out.println("오늘 춥다.");
			++i;// 증감식
		}

		// 무한 루프
		// while (true) {
		// System.out.println("오늘 춥다.");
		// }

		String fmt = "%d x %d = %d \n";
		int dan = 5;
		i = 1;
		while (i <= 9) {
			System.out.printf(fmt, dan, i, dan * i);
			++i;// 증감식
		}
		// 한번도 실행안됨.
		i = 9;
		while (i > 10) {
			System.out.println("While-Do you see?");
		}

		// 하지만
		i = 9;
		do {
			System.out.println("Do while-Do you see?");
		} while (i > 10);

		// 별 출력
		i = 1;
		int j = 1;
		while (i < 6) {
			while (j < 6) {
				System.out.print("*");
				++j;
			}

			i++;
			j = 1;
			System.out.print("\n");

		}

		//
		i = 1;
		j = 1;
		while (i < 6) {
			while (j <= i) {
				System.out.print("*");
				++j;
			}
			i++;
			j = 1;
			System.out.print("\n");
		}
		// 위 문장의 변형
		i = 1;
		j = 1;
		while (i++ < 6) {
			while (j++ <= i) {
				System.out.print("*");
			}
			j = 1;
			System.out.print("\n");

		}

		i = 1;
		j = 5;
		while (i <= 5) {
			while (j >= i) {

				System.out.print("*");
				--j;
			}

			i++;
			j = 5;
			System.out.print("\n");

		}

		// while 문의 조금 다른 용도
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("작업할 코드를 입력하세요.");
			System.out.println("C)회원 등록");
			System.out.println("R)회원 조회");
			System.out.println("U)회원 수정");
			System.out.println("D)회원 삭제");
			System.out.println("Q)프로그램 종료");
			System.out.println(">>>> ");

			String job = sc.nextLine();

			// Q가 입력되면 while에서 나감
			// if (job.equals("Q")) {
			// System.out.println("프로그램 종료");
			// }
			// break;
			switch (job) {
			case "C":
				System.out.println("회원등록 메뉴 선택");
				break;
			case "R":
				System.out.println("회원조회 메뉴 선택");
				break;
			case "U":
				System.out.println("회원수정 메뉴 선택");
				break;
			case "D":
				System.out.println("회원삭제 메뉴 선택");
				break;
			case "Q":
				System.exit(0);
				break;
			}
			break;
		}
		// 반복의 중단 - break
		i = 1;
		int sum = 0;
		fmt = "i - %d ,sum - %d \n";
		while (true) {
			if (sum > 100)

				sum += i++;
			break;
		}
		System.out.printf(fmt, i, sum);

		i = 1;
		while (i++ <= 100) {
			if (i % 2 != 0)
				continue;
			System.out.println(i);
		}
	}
}
