package ch06;
// 배열 선언
// 데이터 타입[] 변수명;
// 데이터 타입 변수명[];
public class ArrEx01 {
	public static void main(String[] args) {
		int[] arrInt;
		int arrInt2[] = null;
		
//		double[] arrDouble;
//		String[] arrString;
		
		// 배열은 참조자료형으로 위치정보를 참조하는 자료형
		
//		System.out.println(arrInt[0]); // 에러: 값이 초기화되지 않은 상태에서 값을 사용할 수 없다.
		System.out.println(arrInt2[0]);
		
		// 배열은 반드시 사용하기 전에 선언과 초기화가 먼저 이루어져야 한다.
	}
}
