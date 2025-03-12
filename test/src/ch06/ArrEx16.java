package ch06;
// 향상된 for문
public class ArrEx16 {
	public static void main(String[] args) {
		int[] arrInt = {1,2,3,4,5};
		
		// 기존 for문을 이용한 출력
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		
		// 향상된 for문을 이용한 출력
		for (int num : arrInt) {
			System.out.println(num);
		}
	}
}
