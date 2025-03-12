package ch06;

public class ReferenceType3 {
	public static void main(String[] args) {
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		
		System.out.println(name1.equals(name2));
		// 문자열인 경우 값을 ==로 비교하지 않는다. equals 메서드 사용!
	}
}
