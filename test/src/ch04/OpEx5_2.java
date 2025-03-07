package ch04;
// 숏컷 : and, or연산에서 왼쪽항의 결과에 따라 오른쪽항의 여부에 상관없이 이미 결과값이
// 정해졌다면 오른쪽항을 확인하지 않는 것
public class OpEx5_2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		// & 연산
		System.out.println(a==b & test()); // f & (test()메서드 실행) t : f
		
		// && 연산
		System.out.println(a==b && test()); // 왼쪽항이 이미 f이므로 f (오른쪽항 확인 X)
	}

	private static boolean test() {
		System.out.println("test()메서드 실행");
		return true;
	}
}
