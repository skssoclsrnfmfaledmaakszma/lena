package array;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {

		// �����¼����࿹��(ppt)
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
			System.out.println("���Ͻô� �¼���ȣ�� �Է��ϼ���(����� -1) ::::::: ");
			int select = sc.nextInt();
			if (0 < select && select < 11) {
				if (seat[select - 1] == 0) {
					seat[select - 1] = select;
					System.out.println("�¼��� ���õǾ����ϴ�.");
				} else {
					System.out.println("�̹� ���õ� �¼��Դϴ�.");
				}
			} else if (select == -1) {
				System.out.println("���Ű� ����Ǿ����ϴ�.");
				break;
			} else {
				System.out.println("1���� 10 ������ �¼��� �������ּ���.");
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
