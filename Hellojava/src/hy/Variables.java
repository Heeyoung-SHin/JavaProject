package hy;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {

		/*
		 * 자바 기본 자료형 int 정수 (byte, short, long) double 실수 char 문자 String 문자열
		 */

		// 변수 : 자료형 변수이름 ;
		int a; // 정수형 변수
		double b; // 실수형 변수
		char c; // 문자 변수(1자)
		String d; // 문자열 변수

		// 상수 : final 자료형 변수이름;
		// 변경불가 자료를 저장할 목적으로 사용
		// 변수이름은 대문자로 작성!

		final int E;
		final double F;
		final char G;
		final String H;

		// 자바 예약어를 변수 이름으로 사용불가!
		// int if;
		// double import;
		// char System;
		// String String; /* 되긴하지만 되도록이면 쓰지않기 */

		// 회원정보 (아이디,비밀번호,이름,나이)
		String userid;
		String pwd;
		String name;
		// String userid, pwd, name;
		// 선언가능하나 가독성 떨어짐

		// String userid = "x", pwd = "y" , name = "z";
		int age;

		// 리터럴 : 컴파일러가 이해할 수 있는 형식으로
		// 작성된 데이터나 값
		long jumin = 1234567891123L;

		// 변수 초기화 : 변수에 값을 대입
		// 변수명 = 값;
		userid = "zzzzz";
		pwd = "123456789";
		name = "heeyoung";
		age = 26;

		b = 123.456;
		float pi = 3.1452F; // .이있어서 더블형으로 인식함으로 리터럴'F' 붙여줌

		c = '희'; // 문자는 '' , 문자열은 ""
		G = 'h';

		// 변수 vs 상수
		c = '우';
		// G = 'x'; G는 파이널 변수기 때문에 위에서 미리 h로 선언해서 또 선언 불가함.

		// 선언과 초기화
		int i = 132;
		double j = 987.123;
		boolean k = true;
		k = false; // 논리형 변수
		// k = 123;
		// k = '가';

		// 변수/상수 이름
		// 변수는 일반적으로 소문자
		// 만일 이름을 두 단어로 구성하는 경우
		// camel 표기법을 사용
		int juminCode;
		String sayHello;

		// 상수는 모두 대문자로 작성
		// 두단어 이상인 경우
		// 각 단어는_으로 이어 사용

		final double PI = 3.14;
		final int THIS_YEAR = 2017;
		final String USER_ID = "zzzzz";

		// JDK7부터 도입된 자릿수 표시 : _
		jumin = 123456789123L;
		jumin = 123_456_789_123L;

		String chars = "abc";
		System.out.println(chars.charAt(0));
		System.out.println((int) chars.charAt(0));

		char ch = 'A';
		System.out.println((int) ch);

		// 특수문자 표현 - escape sequence
		System.out.println("가   나");
		System.out.println("가\t나"); // 탭
		System.out.println("가\n나"); // 줄바꿈
		System.out.println("가\"나"); // 큰따움표
		System.out.println("가\'나"); // 작은따움표

		// 변수 출력하는 방법
		System.out.println("아이디 : " + userid + " 비밀번호 : " + pwd + " 나이 : " + age + "이름 : " + name);
		System.out.println("아이디 : " + userid);
		System.out.println("비밀번호 : " + pwd);
		System.out.println("나이 : " + age);

		// 서식화된 출력 - printf
		System.out.printf("아이디: %s \n 비밀번호: %s \n 나이: %d \n 이름: %s \n", userid, pwd, age, name);

		String fmt = "아이디: %s, 비밀번호: %s, 나이: %d, 이름: %s\n";
		System.out.printf(fmt, userid, pwd, age, name);

		// double vs float : 오차범위
		float avg1 = 296 / 3.0f;
		double avg2 = 296 / 3.0;

		System.out.println(avg1);
		System.out.println(avg2); // double이 오차범위가 더 적어서 추천

		// 키보드로 데이터 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		userid = sc.nextLine();

		System.out.print("비밀번호를 입력하세요 : ");
		pwd = sc.nextLine();

		System.out.print("나이를 입력하세요 : ");
		age = Integer.parseInt(sc.nextLine());

		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();

		System.out.printf(fmt, userid, pwd, age, name);

	}

}
