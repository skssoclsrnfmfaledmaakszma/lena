package control;

import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {
		// ���� ���
		// ctrl+f11�� �¾ �⵵ �Է��ϸ�, �ַ��Ǹſ��� �Ǵ�

		// Ű���带 �Է��ϴ� Scanner��� ��ü(��ǰ)�� ���� ������(�ܿ� �ʿ� ����)
		Scanner sc = new Scanner(System.in);

		System.out.print("�¾ ���� : ");
		int year = sc.nextInt();

		// ���� = 2018 - �¾�⵵ - 1
		int age = 2018 - year - 1;


		if (age >= 17) {
			System.out.println("�ַ��ǸŰ���");
		} else {
			System.out.println("�ַ��ǸźҰ�");
		}

		sc.close();
	}
}
