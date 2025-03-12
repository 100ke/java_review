package ch06;

public class ReferenceType2 {
	public static void main(String[] args) {
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		
		System.out.println(name1 == name2); // false
		// 참조하고 있는 메모리 주소가 다르다.
	}
}
