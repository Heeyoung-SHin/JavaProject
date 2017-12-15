package hy.lab;

import java.util.Scanner;

public class Lab08 {
	public static void main(String[] args) {
		// 4-26
		int sum = 0;
		int i = 0;

		while ((sum += ++i) <= 100) {
			System.out.printf("%d - %d%n", i, sum);

		}
		// 4-27
		int num;
		sum = 0;

		boolean flag = true;

		System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");

		while (flag) {
			System.out.print(">>");

			Scanner sc = new Scanner(System.in);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);

			if (num != 0) {
				sum += num;
			} else {
				flag = false;

			}
		}
		System.out.println("합계:" + sum);
		
		//연습문제 4-4 
		//1+(-2)+3+(-4)+... 몇까지 더해야 합이 100이상
		
		int sum1=0;
		int i=0;
		
		//while()
		
		for(i=1;sum >= 100;i++)
		{
			
		}	
		
		//4-13
		String value ="12o34";
		char ch=' ';
		boolean isNumber = true;
		
		for(int a = 0; i<value.length(); i++)
		{
			//코드입력
		}
		if(isNumber) {
			System.out.println(value+"는 숫자입니다.");
		}
		else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}
		
		//4-14
		
		int answer = ;
				int input =0;
				int count =0;
				
				Scanner s = new Scanner(System.in);
	}

}
