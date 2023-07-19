package test6;
/*
 * 날짜 : 2023/07/18
 * 이름 : 류영호
 * 내용 : 자바 총 정리 연습문제
 */
public class Test1 {

	public static void main(String[] args) {
		int index;
		int primes = 0;
		
		for (int i = 2; i < 100; i++)
		{
			for(index = 2; index < i; index++)
			{
				if (i % index == 0)
				{
					break;
				}
			}
			if(index==primes)
			{
				primes++;
				System.out.printf("%5d%s", i, primes % 10 == 0 ? "\n" : "");
			}
		}
		System.out.printf("\n2부터 100사이의 소수의 개수 : %d개", primes);
	}
}
