package array;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int num = sc.nextInt();

		int[] num = new int[5];

		// for���� �̿��� 5�� �Է�
		for (int i = 0; i < num.length; i++) {
			System.out.print("���� �Է� :: ");
			num[i] = sc.nextInt();
		}

		// ���
		for (int n : num) {
			System.out.println(n);
		}

		System.out.println("====================");
		System.out.println("ã����� �� �Է�");

		// ã�� �� ���� ����
		int find = sc.nextInt();

		// �Է��� ���� ��ġã��
		for (int j = 0; j < num.length; j++) {
			if (num[j] == find) {
				System.out.println(j + 1 + "��°(num[" + j + "])");
			}
		}

		// �ּҰ� ���ϱ�(min�� ���ؼ� ���� ���� min���� ����)
		int min = num[0];
		for (int k = 0; k < num.length; k++) {
			if (num[k] < min) {
				min = num[k];
			}
		}
		System.out.println("�ּҰ� : "+min);
		
		// �ִ밪 ���ϱ�(max�� ���ؼ� ���� ���� min���� ����)
		int max = num[0];
		for (int l = 0; l < num.length; l++) {
			if (num[l] > max) {
				max = num[l];
			}
		}
		System.out.println("�ִ밪 : "+max);


	}

}
