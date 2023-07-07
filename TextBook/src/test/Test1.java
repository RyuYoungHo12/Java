package test;
/*
 * 문제1. 첫째 줄에는 별1개, 둘째 줄에는 별2개
 * N번째 줄에는 별N개를 찍는 프로그램을 작성하시오.
 * 단, 오른쪽 기준으로 정렬
 * 입력 조건 : 첫째 줄에 N(1 <= N <= 100)이 주어진다.
 * 출력 조건 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */
import java.util.Scanner;

public class Test1{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력을 받기 위해 Scanner객체 사용
		
		int num = sc.nextInt();//범위는 입력받은 num변수로 지정
		
		for(int i=0; i<num; i++) {//몇번째 줄까지 생성할지 범위지정
			for(int j=1; j< num-i; j++) {//num변수에 i를 빼줘 줄이 바뀔떄마다
			System.out.print(" ");		 // 한개씩 공백 수를 줄인다.
		}
			
		for(int j=0; j<=i; j++) {//i값의 범위에 의해 줄마다 별을 출력할 개수지정
			System.out.print("*");//별을 출력할때 개수가 정해지며 출력
		}
		
		System.out.println();// 줄이 바뀔때 마다 개행
		}
		sc.close();
	}
}