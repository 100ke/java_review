package ch06;

public class ArrEx08 {
	public static void main(String[] args) {
		int[] arrInt = new int[100];
		
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i+1;
			System.out.println(arrInt[i]);
		}
	}
}
