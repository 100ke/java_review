package ch05;

public class WhileEx {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i<=100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
