package test3;
/*
 * 내용 : 자바 배열 최대값 찾기 연습
 */
public class Test2 {
	public static void main(String[] args) {
		
		int arr[] = {17,22,18,33,58,7,26,42};
		
		int max = arr[0];
		
		for(int i=0; i < arr.length; i++) {
			if(max < arr[i]) {
				max =arr[i];
			}
		}
		
		System.out.println("배열 arr에서 가장 큰 수 : " + max);
	}
}
