package ch04;

public class OpEx9 {
	public static void main(String[] args) {
		int a=5;
		int b=4;
		int c=3;
		
		System.out.println(a+b*c); // * 먼저 실행
		System.out.println((a+b)*c); // 괄호로 우선순위를 높여줌
	}
}
