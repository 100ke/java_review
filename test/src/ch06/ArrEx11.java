package ch06;

public class ArrEx11 {
	public static void main(String[] args) {
		int[][][] arrInt = new int[3][3][3];
		
		int value = 0;
		// 값 대입
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				for (int k = 0; k <= 2; k++) {
					arrInt[i][j][k] = value++;
					System.out.print(arrInt[i][j][k]+"\t");
				}
				System.out.println();
			}
		}
	}
}
