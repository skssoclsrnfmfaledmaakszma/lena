package control;

import java.util.Scanner;

public class IfTest4Scanner {

	public static void main(String[] args) {
		// �Է��׽�Ʈ - �����, �� �ʿ� ����

		Scanner sc = new Scanner(System.in);

		System.out.print("�̸���.. ");
		// ���ڿ�(String) �Է�
		String name = sc.next();

		System.out.print("���̴�.. ");
		// 34 �� ����(int) �Է�
		int age = sc.nextInt();

		System.out.print("�����Դ�.. ");
		// 88.8 �� �Ǽ�(double) �Է� ����
		double weight = sc.nextDouble();
		System.out.println("=============================");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("������ : " + weight);

		sc.close();

	}

}
