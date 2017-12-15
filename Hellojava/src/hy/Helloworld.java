package hy; //무조건 소문자

// 클래스 이름과 파일이름은 동일. 클래스 이름은 대문자로 작성.

public class Helloworld { // 파일명과 클래스명 동일

	public static void main(String[] args) {

		System.out.println("Hello,World!");

	}

}

// 파일안에 2개 이상의 클래스를 정의 하는 경우 2번째 클래스부터는 public 접근제한자를 제외하고 작성한다.

class HelloWorld2 { // public파일은 하나만 존재 가능

	public static void main(String[] args) {

		System.out.println("Hello,World!2");

	}

}