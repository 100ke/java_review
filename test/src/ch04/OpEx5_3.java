package ch04;
// 나누기 연산 시 0으로 나눌경우 에러발생
public class OpEx5_3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		// & 연산
//		System.out.println(b>0 & (a/b>0)); // f & 오류발생
		
		// && 연산
		System.out.println(b>0 && (a/b>0)); // f 이므로 우항 확인 x 결과 바로 f
	}
}
