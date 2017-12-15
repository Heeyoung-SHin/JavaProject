package hy;

public class Operators {

	public static void main(String[] args) {

		// 연산자 - 각종 작업을 간단하게 표시한 기호
		// 산술연산자 : +,-,*,/,%
		//
		int x = 10, y = 4;
		System.out.printf("10 + 4 = %d \n", x + y);
		System.out.printf("10 - 4 = %d \n", x - y);
		System.out.printf("10 * 4 = %d \n", x * y);
		System.out.printf("10 / 4 = %d \n", x / y);
		System.out.printf("10 %% 4 = %d \n", x % y);
		// System.out.printf("10 %% 4 = %d \n", x % y);

		// 비교연산자 : > < == !=
		String a = "Hello";
		String b = "hello";
		String c = "Hello";
		String d = new String("Hello");

		System.out.printf("a == b = %b \n", a == b);
		System.out.printf("a == c = %b \n", a == c);
		System.out.printf("b == c = %b \n", b == c);
		System.out.printf("c == d = %b \n", c == d);
		System.out.printf("c.equals(d) = %b \n", c.equals(d));
		System.out.println("**********************");

		System.out.printf("10 > 4 = %b \n", x > y);
		System.out.printf("10 < 4 = %b \n", x < y);
		System.out.printf("10 == 4 = %b \n", x == y);
		System.out.printf("10 != 4 = %b \n", x != y);

		// 논리연산자 : &&, ||, !
		// &&, || 등은 단축 논리연산이 지원
		int i = 5;
		int j = 13;

		System.out.printf("(i>5 || j<15) = %b \n", i > 5 || j < 15);
		System.out.printf("(i<5 && j>10) = %b \n", i < 5 && j > 10);

		// 대입 연산자 : =, +=, -=, *=, /=
		int z = x + y;
		z += x; // z = z + x;
		z += y; // z = z + y;

		// 증가/감소 연산자 : ++, --
		++z; // 전치, z = z + 1;
		--z; // z = z - 1;

		z++; // 후치
		z--; //

		i = 5;
		j = 5;
		j = ++i;
		System.out.printf("i = 5; j = 5; j = ++i : %d \n", j);

		i = 5;
		j = 5;
		j = i++;
		System.out.printf("i = 5; j = 5; j = i++ : %d", j);

		// 삼항연산자 ? :
		// (논리식) ? (참일때 처리):(거짓일때 처리)
		double avg = 296 / 3.0;
		// char grd = (avg >= 90) ? '수' : '우';
		// grd = (avg >= 80) ? '우' : '미';

		char grd = (avg >= 90) ? '수' : (avg >= 80) ? '우' : (avg >= 70) ? '미' : (avg >= 60) ? '양' : '가';

		System.out.printf("\n성적은?" + grd);

		// 연산자 우선순위
		// 표현식의 계산순서를 결정

		z = x + y * 3;
		z = (x + y) * 3;

		int k = 1, l = 2, m = 3;
		int n = k + l * m;
		int o = (k + l) * m;

		System.out.printf("n값은?" + n + "o값은?" + o);
		// System.out.println(o);

		// 형변환
		// 이미 선언된 변수의 자료형은
		// 형변환cast 연산자인 ()를 이용해
		// 명시적으로 변환 가능
		double avg2 = 296 / 3;
		System.out.printf("296 / 3 =%f \n", avg2);

		avg2 = (double) 296 / 3;
		System.out.printf("296 / 3 =%f \n", avg2);

		// 정수연산의 기본단위 : int
		byte p = 10;
		byte q = 10;
		p = (byte) (p + 1);
		p = (byte) (p + q);

		// 확대변환 (자동으로 처리)
		int s = p; // byte -> int

		// 축소변환 (명시적으로 기술)
		// 데이터 소실의 위험성 감수
		s = 130;
		p = (byte) s; // byte는 -128~ 127까지라서 다시 -로 돌아감. overflow발생
		System.out.println(p);

	}
}
