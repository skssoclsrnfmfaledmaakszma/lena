package array;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int num = sc.nextInt();

		int[] num = new int[5];

		// for문을 이용해 5번 입력
		for (int i = 0; i < num.length; i++) {
			System.out.print("점수 입력 :: ");
			num[i] = sc.nextInt();
		}

		// 출력
		for (int n : num) {
			System.out.println(n);
		}

		System.out.println("====================");
		System.out.println("찾고싶은 값 입력");

		// 찾을 값 변수 저장
		int find = sc.nextInt();

		// 입력한 값의 위치찾기
		for (int j = 0; j < num.length; j++) {
			if (num[j] == find) {
				System.out.println(j + 1 + "번째(num[" + j + "])");
			}
		}

		// 최소값 구하기(min과 비교해서 작은 값을 min으로 저장)
		int min = num[0];
		for (int k = 0; k < num.length; k++) {
			if (num[k] < min) {
				min = num[k];
			}
		}
		System.out.println("최소값 : "+min);
		
		// 최대값 구하기(max과 비교해서 작은 값을 min으로 저장)
		int max = num[0];
		for (int l = 0; l < num.length; l++) {
			if (num[l] > max) {
				max = num[l];
			}
		}
		System.out.println("최대값 : "+max);


	}

}
