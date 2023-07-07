package test;

/*
 * 문제2. 다음과 같이 출력하는 프로그램을 작성하시오.
 * 
 */
public class Test2 {
	public static void main(String[] args) {
		
		int n = 4; //n변수에 몇번째 줄까지 출력할지 값을 정해 대입
		int count = 1; // count변수는 검은 별을 출력할 범위를 지정할 용도 1로 시작
		for(int i = 1 ; i<n ; i++) {//몇째줄까지 반복해서 출력할 지 n변수로 범위 지정
			
			for(int j=0 ; j < n-i ; j++) {//줄이 바뀔때마다 1개씩 늘어나는 흰별 출력문
				System.out.print("☆");
			}
			
			for(int j=1 ; j <= count ; j++) {//줄이 바뀔때마다 2개씩 늘어나는 검은별 출력문
				System.out.print("★");		 //count변수의 값을 범위로 지정
			}
			for(int j =0; j<n-i; j++) {	////줄이 바뀔때마다 1개씩 늘어나는 흰별 출력문
				System.out.print("☆");
			}
			count += 2;		//1줄 검은별1개 출력 후 줄이 바뀔때마다 검은별이2개씩 늘어남
			System.out.print("\n"); //개행처리
		}		
	}
}
