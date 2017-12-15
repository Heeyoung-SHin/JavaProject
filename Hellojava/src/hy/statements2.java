package hy;

public class statements2 {
	public static void main(String[] args) {

		// 반복문
		// 지정한 횟수만큼 어떤 작업을 반복
		for (int i = 1; i <= 9; i = i + 1) {
			System.out.println("Too Cold!!!");

		}

		for (int i = 1; i <= 5; ++i)
			System.out.println(i);

		// 1~100까지 출력
		for (int z = 1; z <= 100; z++)
			System.out.println(z);

		// 1~100까지 홀수만 출력
		for (int h = 1; h <= 100; h = h + 2)
			System.out.println(h);

		// 100까지 짝수 출력
		for (int j = 2; j <= 100; j = j + 2)
			System.out.println(j);

		// 구구단
		// 5 * 1 = 5 ....

		String fmt = "%d * %d = %d \n";
		for (int i = 1, j = 5; i <= 9; i++)
			System.out.printf(fmt, j, i, j * i);

		// 4-15
		System.out.println("i\t2*i\t2*i-1\ti*i\t11-i\ti%3\ti/3");
		System.out.println("----------------------------------------------------");

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d%n", i, 2 * i, 2 * i - 1, i * i, 11 - i, i % 3, i / 3);
		}

		// 중첩 for문
		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= 10; ++j) {
				System.out.print("*");
			}

			System.out.print("\n");
			System.out.println("**********");
		}
		// 직각삼각형
		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}

			System.out.print("\n");
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}

			System.out.print("\n");
		}
	}
}
