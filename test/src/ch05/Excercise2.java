package ch05;

public class Excercise2 {
	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println("짝수의 합계 : "+evenSum);
		System.out.println("홀수의 합계 : "+oddSum);
	}
}
