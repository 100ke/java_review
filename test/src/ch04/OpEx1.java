package ch04;
// 대입연산
public class OpEx1 {
	public static void main(String[] args) {
		int number1 = 10;
		System.out.println("number1 = 10 -> "+number1);
		number1 += 10; // 더하고 대입
		System.out.println("number1 += 10 -> "+number1);
		number1 -= 10; // 빼고 대입
		System.out.println("number1 -= 10 -> "+number1);
		number1 *= 2; // 곱하고 대입
		System.out.println("number1 *= 2 -> "+number1);
		number1 /= 2; // 나누고 대입
		System.out.println("number1 /= 2 -> "+number1);
		number1 %= 3; // 나머지 대입
		System.out.println("number1 %= 2 -> "+number1);
	}
}
