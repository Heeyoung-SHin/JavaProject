package hy.lab;

import java.util.Scanner;

public class Lab09 {
	public static void main(String[] args) {

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0];
		int min = score[0];

		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);

		// 5-10
		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		}
		System.out.println();

		for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false;

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true;
				}
			}

			if (!changed)
				break;

			for (int k = 0; k < numArr.length; k++)
				System.out.print(numArr[k]);
			System.out.println();
		}

		// 5-11
		int[] numArr1 = new int[10];
		int[] counter = new int[10];

		for (int i = 0; i < numArr1.length; i++) {
			numArr1[i] = (int) (Math.random() * 10);
			System.out.print(numArr1[i]);
		}
		System.out.println();

		for (int i = 0; i < numArr1.length; i++) {

			counter[numArr1[i]]++;
			// System.out.println(counter[numArr1[i]]);
		}

		for (int i = 0; i < numArr1.length; i++) {
			System.out.println(i + "의 개수 :" + counter[i]);
		}

		// 5-20

		final int SIZE = 10;
		int x = 0, y = 0;

		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = { { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, { 1, 1, 1, 1, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 1, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }, };

		for (int i = 1; i < SIZE; i++)
			board[0][i] = board[i][0] = (char) (i + '0');

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("좌표를 입력하세요.(종료는00)>");
			String input = sc.nextLine();

			if (input.length() == 2) {
				x = input.charAt(0) - '0';
				y = input.charAt(1) - '0';

				if (x == 0 && y == 0)
					break;
			}

			if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';
			for (int i = 0; i < SIZE; i++)
				System.out.println(board[i]);
			System.out.println();
		}

		// 5-21
		final int SIZE1 = 5;
		int x1 = 0, y1 = 0, num1 = 0;

		int[][] bingo = new int[SIZE][SIZE];

		for (int i = 0; i < SIZE1; i++)
			for (int j = 0; j < SIZE; j++)
				bingo[i][j] = i * SIZE + j + i;

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE1);
				y = (int) (Math.random() * SIZE1);

				int tmp = bingo[i][j];
				bingo[i][j] = bingo[i][j];
				bingo[x][y] = tmp;
			}

		}
		do {
			for(int=0;i<SIZE;i++) {
				
			}
		}
	}
}
