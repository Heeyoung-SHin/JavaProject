package hy.lab;

public class lab02 {
	public static void main(String[] args) {

		// 3번
		int a = 10;
		int b = 20;
		int c = 30;
		int result = 0;

		result = 3 * a;
		result = 3 * a + b;
		result = (a + b) / 7;
		result = (3 * a + b) / (c + 2);

		// 4번
		// int number;
		// number = (1 / 3) * 3;
		// number = ((double) 1 / 3) * 3;
		System.out.printf("(1 / 3) * 3 = %f \n", ((double) 1 / 3) * 3);

		// 5번
		int quotient, remainder;
		quotient = 7 / 3;
		remainder = 7 % 3;

		System.out.println("quotient = " + quotient + "remainder = " + remainder);

		// 6번
		int result2 = 11;
		result2 /= 2; // r=r/2;
		System.out.println("result = " + result2);

		// 7번
		double x = 2.5;
		double y = -1.5;
		int m = 18;
		int n = 4;

		// www.wolframalpha.com
		System.out.println(x + n * y - (x + n) * y);
		System.out.println(m / n + m % n);
		System.out.println(5 * x - n / 5);
		System.out.println(1 - (1 - (1 - (1 - (1 - n)))));

		// 8번 논리 연산자의 단축평가
		System.out.println(3 + 4.5 * 2 + 27 / 8);
		System.out.println(true | false & 3 < 4 | !(5 == 7));
		// System.out.println(!true > 'A'); 틀린수식
		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');

		// 9번
		System.out.println("May 13, 1988 fell on day number ");

		// System.out.println("May 13, 1988 fell on day number ");
		// 특정일의 요일을 알아내는 수식
		System.out.println((2017 + (2017 / 4) - (2017 / 100) + (2017 / 400) + (13 * 12 + 8) / 5 + 12 % 7));
		System.out.println("//hello there" + '9' + 7);
		System.out.println('H' + 'I' + "is" + 1 + "more example");
		// System.out.print("Print both of us","Me too"); 중간 콤마 있으면 프린트문 사용x
		System.out.println("No! Here is" + 1 + "more example");
		// System.out.print();
		// System.out.println;

		// 11번
		System.out.println(27 / 13 + 4);
		System.out.println(27 / 13 + 4.0);
		System.out.println(27 / 13.0 + 4);
		// System.out.println('a' && !'b');
		System.out.println((double) 'a' / 'b');

		// 12번
		int o = (int) 3.9;
		System.out.println("o==" + o);

		// 13번
		int g = 3;
		/*
		 * g++; System.out.println("g==" + g); g--; System.out.println("g==" + g);
		 */
		System.out.println("g==" + g++);
		System.out.println("g==" + g);

		// 14번
		System.out.println("2+2=" + (2 + 2));
		System.out.println("2+2=" + 2 + 2);

		// 15번
		char l, r;
		l = 'r';
		System.out.println(l);
		System.out.println((int) l);
		r = 's';
		System.out.println(r);
		l = r;
		System.out.println(l);

	}

}
