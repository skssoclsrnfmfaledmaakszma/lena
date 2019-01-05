package array;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {

		// 극장좌석예약예제(ppt)
		int[] seat = new int[10];

		System.out.println("----------------------------------------------------------------------------");

		for (int i = 0; i < seat.length; i++) {
			System.out.print(i + 1 + "	");
		}
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + "	");
		}
		System.out.println("");
		System.out.println("");

		Scanner sc = new Scanner(System.in);

//		for (int j = 0; j < 3; j++) {
		
		while(true){
			System.out.println("원하시는 좌석번호를 입력하세요(종료는 -1) ::::::: ");
			int select = sc.nextInt();
			if (0 < select && select < 11) {
				if (seat[select - 1] == 0) {
					seat[select - 1] = select;
					System.out.println("좌석이 선택되었습니다.");
				} else {
					System.out.println("이미 선택된 좌석입니다.");
				}
			} else if (select == -1) {
				System.out.println("예매가 종료되었습니다.");
				break;
			} else {
				System.out.println("1에서 10 사이의 좌석을 선택해주세요.");
			}
		}
//		}

		System.out.println("----------------------------------------------------------------------------");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(i + 1 + "	");
		}
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------");
		for (int i = 0; i < seat.length; i++) {
			if(seat[i]!=0) {
				System.out.print("v" + "	");
			}else {
				System.out.print(seat[i] + "	");	
			}
		}

	}

}
