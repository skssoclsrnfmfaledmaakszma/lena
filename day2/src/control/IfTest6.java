package control;

import java.util.Scanner;

public class IfTest6 {

	public static void main(String[] args) {
		// if else ��
		// �Է¹��� ��ȣ�� �޴��Ǵ�

		// Ű���带 �Է��ϴ� Scanner��� ��ü(��ǰ)�� ���� ������(�ܿ� �ʿ� ����)
		Scanner sc = new Scanner(System.in);

		System.out.println("�޴���������. ");
		System.out.println("1���� 2���� 3����");
		System.out.println("===============");
		System.out.print("����� ������ : ");
		// �޴��� ���ڷ� �Է��ϵ��� ��.
		int menu = sc.nextInt();
		System.out.println("===============");
		// 1�Է��ϸ� ����, 2�Է��ϸ� ����, 3�Է��ϸ� ����, �������� fail
		if (menu == 1) {
			System.out.println("���ָ� ���̱���.");
		} else if (menu == 2) {
			System.out.println("���ָ� ���̱���.");
		} else if (menu == 3) {
			System.out.println("������ ���̱���.");
		// 1,2,3 ���� ��� ���ڸ� �Է����� �� else
		} else {
			System.out.println("���� ���ž���");
		}

		sc.close();
	}
}
