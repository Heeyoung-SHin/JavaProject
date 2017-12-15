package hy.lab;

import java.util.Scanner;

public class Lab04 {
	public static void main(String[] args) {
		// 16번
		int n = 1;
		int k = 2;
		int r = 3;

		/*
		 * a번 if (k < n) r = k; System.out.println(r);
		 */
		/*
		 * b번 if (n < k) r = k; else r = k + n; System.out.println(r);
		 */
		/*
		 * c번 if (r < k) n = r; else k = n; System.out.println(k);
		 */
		// d번
		if (r < n + k)
			r = 2 * n;
		else
			k = 2 * r;
		System.out.println(k);

		// 17번

		// int x, y;
		// x = 1;
		/*
		 * if (x && y == 0) { x = 1; y = 1; }
		 * 
		 * if (1 <= x <= 10) System.out.println(x);
		 */

		// 18번
		int number;
		number = 30; // ||35

		if (number % 2 == 0)
			System.out.println(number + "is even");
		System.out.println(number + "is odd");

		if (number % 2 == 0)

			System.out.println(number + "is even");
		else
			System.out.println(number + "is odd");

		// 19번
		int x = 3;
		int y = 2;
		int z;

		if (x > 2) {
			if (y > 2) {
				z = x + y;
				System.out.println("z is" + z);
			}
		} else
			System.out.println("x is" + x);

		// 20번
		int a = 3;
		a = a++;
		if (a == 3)
			System.out.println("Three");
		else
			System.out.println("Four");

		// 20-1
		int a1 = 3;
		++a1;
		// a1 = a1++;
		if (a1 == 3)
			System.out.println("Three");
		else
			System.out.println("Four");

		// 21

		Scanner sc = new Scanner(System.in);

		System.out.println("결혼여부 입력. 0미혼,1기혼");
		int isMarried = sc.nextInt();

		System.out.println("연봉을 입력하세요");
		int salary = sc.nextInt();
		int tax = 0;

		if (isMarried == 0) {

			if (salary < 3000) {
				tax = (int) (salary * 0.1);
			} else
				tax = (int) (salary * 0.25);

		} else if (isMarried == 1) {

			if (salary < 6000) {
				tax = (int) (salary * 0.1);
			} else
				tax = (int) (salary * 0.25);

		}

		System.out.printf("결혼여부" + isMarried + "연봉" + salary + "세금" + tax);

		// 22번
	}

}
