package ch04;
// 논리연산
public class OpEx5 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		// AND 연산
		System.out.println(a > b && a == 10); // t&&t : t
		System.out.println(a > b && a == b); // t&&f : f
		
		// OR 연산
		System.out.println(a>b || a==b); // t||f : t
		System.out.println(a<b || a==b); // f||f : f
		
		// XOR 연산
		System.out.println(a>b ^ a==10); // t^t : f
		System.out.println(a>b ^ a==b); // t^f : t
		
		// NOT 연산
		System.out.println(!(a>b)); // !t : f
		System.out.println(!(a<b)); // !f : t
		
		// && & 차이
		System.out.println(a==b && a>b); // f&&t : f
		System.out.println(a==b & a>b); // f&t : f
	}
}
