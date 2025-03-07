package ch03;
// 형변환
// byte < short < int < long < float < double
public class CastingEx {
	public static void main(String[] args) {
		// 자동형변환 예시
		int number = 10;
		
		long number2 = number; // int < long
		
		System.out.println(number2);
		
		// 강제형변환 예시
		double pi = 3.14;
		
		int pi2 = (int)pi; // double 자료형 pi를 int로 강제형변환
		
		System.out.println(pi2); // 값의 손실 발생
		
		// 강제형변환 예시2
		double score = 100;
		
		int score2 = (int)score;
		
		System.out.println(score2); // 값의 손실 x
	}
}
