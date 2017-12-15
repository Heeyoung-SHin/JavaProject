package hy;

public class Arrays {
	public static void main(String[] args) {
		// 배열 - 동일한 자료형 데이터들의 묶음
		String name1, name2, name3;
		// 자료형[] 변수명;

		String[] names;

		// 배열 초기화
		// 변수명 = new 자료형[크기];
		names = new String[3];

		// 배열 다루기
		// 변수명 [위치값];

		names[0] = "희영";
		names[1] = "희영1";
		names[2] = "희영2";

		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

		// 국어점수
		int[] kor;
		kor = new int[3];
		kor[0] = 100;
		kor[1] = 90;
		kor[2] = 99;

		for (int i = 0; i < kor.length; i++) {
			System.out.println(kor[i]);

		}

		// 배열은 참조형이다?
		System.out.println(kor);

		// 배열요소의 값은 자동으로 초기화된다.
		String[] a = new String[1];
		int[] b = new int[1];
		char[] c = new char[1];
		double[] d = new double[1];
		boolean[] e = new boolean[1];

		System.out.println(a[0]);
		System.out.println(b[0]);
		System.out.println(c[0]);
		System.out.println(d[0]);
		System.out.println(e[0]);

		// 배열의 길이 : 배열변수.length
		// names.length=10; 상수이므로 변경불가.

		// 배열 선언과 동시에 초기화하기
		int[] f = { 99, 77, 65 };
		for (int i = 0; i < f.length; i++)

		{
			System.out.println(f[i]);
		}

		// 2차원 배열 : [][]-행열
		int[][] lotto = new int[3][6];
		lotto[0][0] = 15; // 처음
		lotto[2][3] = 33; // 끝

		// 1-45 사이 정수를 6개를 출력하는 코드 작성

		for (int j = 0; j < 3; j++) {

			for (int i = 0; i < 6; i++) {

				int rand = (int) (Math.random() * 100) + 1;
				int lotto645 = rand % ((45 - 1) + 1) + 1;

				// System.out.printf("%d,", lotto645);
				lotto[j][i] = lotto645;

				// System.out.println(lotto[j][i]);

			} // for i

		} // for j

		for (int j = 0; j < 3; ++j) {
			for (int i = 0; i < 6; ++i) {
				System.out.printf(" %2d ", lotto[j][i]);
			}
			System.out.println();
		}

		// 향상된 for문으로 배열 다루기
		// for(배열요소타입 변수명 : 배열)
		int[] abc = { 12, 34, 56, 78, 90 };
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
		for (int ab : abc) {
			System.out.println(ab);
		}
		// 2차원 배열에 대한 향상된 for문 사용
		for (int[] row : lotto) {
			for (int col : row) {
				System.out.println(col);
			}
			System.out.println();
		}

	}

}
