package control;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		// switch�� 
		// �Է¹��� ���ڿ�(String)���� �޴��Ǵ�

		// Ű���带 �Է��ϴ� Scanner��� ��ü(��ǰ)�� ���� ������(�ܿ� �ʿ� ����)
		Scanner sc = new Scanner(System.in);

		System.out.println("�������� ������");
		System.out.println("�߱�, ��, e������");
		System.out.println("===============");
		System.out.print("����� �����ϴ� �������� : ");
		
		// �������� ���ڷ� �Է��ϵ��� ��.
		String sports = sc.next();
		System.out.println("===============");
	
		switch (sports) {
		case "�߱�":
			System.out.println("�߱��夡��");
			break;
		case "��":
			System.out.println("����Ʈ����");
			break;
		case "e������":
			System.out.println("PC�椡��");
			break;
		default:
			System.out.println("�̺� ���� ������");
			break;
		}

		sc.close();
	}
}
