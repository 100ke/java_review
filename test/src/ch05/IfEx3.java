package ch05;

public class IfEx3 {
	public static void main(String[] args) {
//		int math = 90;
		int math = 50;
		int eng = 95;
		
		if (math>=60) {
			if (eng>=60) {
				System.out.println("pass");
			}
		} else {
			System.out.println("non-pass");
		}
	}
}
