package ch03;

public class CharType {
	public static void main(String[] args) {
		char a = 'A';
		System.out.println("a: "+a); //a: A
		
		int b = a;
		System.out.println("b: "+b); //b: 65
		
		char c = 66;
		System.out.println("c: "+c); //c: B
		
		int d = a+b; // 65+65
		System.out.println("d: "+d); //d: 130
	}
}
