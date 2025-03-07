package ch04;
// 산술연산
public class OpEx2 {
	public static void main(String[] args) {
		int a = 5+5;
		System.out.println("5+5="+a);
		int b = a-5;
		System.out.println("10-5="+b);
		int c = b*2;
		System.out.println("5*2="+c);
		int d = c/5;
		System.out.println("10/5="+d);
		// 나머지 연산
		int e = 10%3; // 몫 3, 나머지 1
		System.out.println("10%3="+e);
		
		System.out.println("나누기 연산 시 형변환");
		// 몫이 나누어 떨어지지 않을 때
		int x = 10;
		int y = 4;
		System.out.println("10/4="+x/y); // 2.5가 2로 출력
//		>> JAVA에서 정수와 정수의 연산 결과는 항상 정수
		
		double w = 10;
		int z = 4;
		System.out.println("10/4="+w/z); // 2.5 출력
		
		// 강제형변환
		int k = 10;
		int s = 4;
		System.out.println("10/4="+(double)k/s); // 정수끼리의 연산이지만 2.5 출력
	}
}
