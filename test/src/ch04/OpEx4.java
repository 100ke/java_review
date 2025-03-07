package ch04;
// 비교연산
public class OpEx4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println(a>b); // t
		System.out.println(a>=b); // t
		System.out.println(a<b); // f
		System.out.println(a<=b); // f
		System.out.println(a==b); // f
		System.out.println(a!=b); // t
		
		System.out.println("--------");
		
		boolean c = a == b; // c 변수에 결과값 대입
		System.out.println("c = "+c);
		boolean d = c == false; // d 변수에 결과값 대입
		System.out.println("d = "+d);
	}
}
