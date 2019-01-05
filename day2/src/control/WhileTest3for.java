package control;

public class WhileTest3for {

	public static void main(String[] args) {
		// for문(반복문)
		// 1부터 100까지 더함

		// 더한 값을 저장할 값
		int sum = 0;

		// i = 1(처음 값) ; i이 101보다 작을때까지 ; i을 1씩 더함
		for (int i = 1; i < 100; i++) {
		
		// sum에 1을 더하고, 반복해서 2를 더하고 .... 100까지 더함
			sum = sum + i;

		}
		
		System.out.println(sum);

	}
}
