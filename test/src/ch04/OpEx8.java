package ch04;
// 문자열 연산
public class OpEx8 {
	public static void main(String[] args) {
		String name = "홍길동";
		System.out.println("안녕하세요. "+name+"입니다.");
		
		int height = 180;
		System.out.println("저의 키는 "+height+"cm 입니다.");
		// height가 문자열연산으로 인해 문자열로 자동형변환
		
//		String weight = 75.5; // 에러발생 (문자자료형 변수에는 숫자 대입 불가)
		String weight = 75.5+""; // 문자열로 자동형변환
		System.out.println("제 몸무게는 "+weight+"kg 입니다.");
		
		int ageInt = 20; // 정수
		String ageString = "20"; // 문자열
	}
}
