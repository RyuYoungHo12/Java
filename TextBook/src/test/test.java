package test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 A를 입력하세요 : ");
		int A = scanner.nextInt();
		
		System.out.println("정수 B를 입력하세요 : ");
		int B = scanner.nextInt();
		
		int result = A -B;
		
		System.out.println("A - B = "+ result);
		
		scanner.close();
		
	}
}
