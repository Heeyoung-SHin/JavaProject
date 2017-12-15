package hy.lab;

import java.util.Scanner;

/*성적 처리 프로그램 V1
 * 간단한 성적처리를 수행하는 프로그램
 * 입력 : 이름 국어 영어 수학
 * 처리 : 총점 평균 학점
 * 출력 : 이름 국어 영어 수학 총점 평균 학점*/

public class SungJukV1 {
	public static void main(String[] args) {

		String name;
		int korean, english, math;
		int total;
		double avg;
		// char grd;

		/*
		 * name = "신희영"; korean = 99; english = 90; math = 88;
		 */
		// System.out.printf("이름=" + name + "국어=" + korean + "영어=" + english + "수학=" +
		// math + "총점=" + total + "평균=" + avg);

		// *************************

		Scanner sc = new Scanner(System.in); // ctrl shift o
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();

		System.out.print("국어를 입력하세요 : ");
		korean = Integer.parseInt(sc.nextLine());

		System.out.print("영어를 입력하세요 : ");
		english = Integer.parseInt(sc.nextLine());

		System.out.print("수학을 입력하세요 : ");
		math = Integer.parseInt(sc.nextLine());

		total = korean + english + math;
		avg = total / 3;

		String fmt = "이름: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균: %f\n";
		// fmt += "1이름: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균: %f\n";
		System.out.printf(fmt, name, korean, english, math, total, avg);

	}

}
