package control;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// switch�� (IfTest6�� ��� ����)
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

		switch (menu) {
		case 1:
			System.out.println("���ָ� ���̱���.");
			// case���� break�� �Է��ؾ�, �Ʒ��� ������ ���� ��µ��� ����.
			break;
		case 2:
			System.out.println("���ָ� ���̱���.");
			break;
		case 3:
			System.out.println("������ ���̱���.");
			break;
			// case 1,2,3�� ������ default ���� ���(else�� ���� ����)
		default:
			System.out.println("���� ���ž���");
			break;
		}

		sc.close();
	}
}
