package ch05;

public class Excercise7 {
	public static void main(String[] args) {
//		int dice = (int)(Math.random()*6)+1;
//		int count = 1;
//		while (dice != 6) {
//			System.out.println(dice);
//			dice = (int)(Math.random()*6)+1;
//			count++;
//		}
//		System.out.println(6);
//		System.out.println("총 주사위를 굴린 횟수 : "+count);
		
		int count = 0;
		while (true) {
			int dice = (int)(Math.random()*6)+1;
			System.out.println(dice);
			count++;
			
			if (dice==6) {
				break;
			}
		}
		System.out.println("총 주사위를 굴린 횟수 : "+count);
	}
}
