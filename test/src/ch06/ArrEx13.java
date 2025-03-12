package ch06;
// 배열 복사
// 1. for문 이용
public class ArrEx13 {
	public static void main(String[] args) {
		// 원본 배열
		int[] arrInt = {1,2,3};
		
		// 복사할 배열
		int[] arrInt2 = new int[5];
		
		// 복사할 배열에 값 대입
		for (int i = 0; i < arrInt.length; i++) {
			arrInt2[i] = arrInt[i];
		}
		
		// 배열 값 출력
		for (int i = 0; i < arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}
}
