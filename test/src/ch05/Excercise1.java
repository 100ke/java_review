package ch05;

public class Excercise1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%5==0) {
				sum+=i;
			}
		}
		System.out.println("5의 배수의 합계 : "+sum);
	}
}
