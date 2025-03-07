package ch04;
// 비트연산
public class OpEx6 {
	public static void main(String[] args) {
		// true : 1  / false : 0
		System.out.println("2: "+Integer.toBinaryString(2)); // 10진수 2를 2진수로 변환
		System.out.println("3: "+Integer.toBinaryString(3)); // 10진수 2를 2진수로 변환
		
		// 비트 논리연산
		System.out.println("2&3 : "+(2&3));
		System.out.println("2|3 : "+(2|3));
		System.out.println("2^3 : "+(2^3));
		System.out.println("~3 : "+~3);
		
		System.out.println("~3을 이진수로 : "+Integer.toBinaryString(~3));
		// int : 리터럴이라 32자리
		// 00000000000000000000000000000011  : 3
		// 11111111111111111111111111111100  : ~3
		// 첫자리는 부호를 나타내는 비트를 포함하여 모든 비트를 반대로 변환
		
		// ~3의 2진수값의 길이
		// 첫자리(부호 나타내는 비트), 나머지 31자리로 정수자료형을 메모리에 저장
		System.out.println(Integer.toBinaryString(~3).length());
		
		System.out.println(Integer.MAX_VALUE); // 정수자료형의 최대값 (2^31 - 1)
		
		System.out.println(Integer.parseInt("1111111111111111111111111111100", 2) - Integer.MAX_VALUE-1);
		
//		System.out.println(Integer.parseInt("1111111111111111111111111111100", 2));
//		System.out.println(- Integer.MAX_VALUE-1);
	}
}
