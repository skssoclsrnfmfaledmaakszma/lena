package control;

import java.util.Scanner;

public class IfTest7 {

	public static void main(String[] args) {
		// �� ���� �Է¹޾� ���� �� ū�� �Ǻ�

		// Ű���带 �Է��ϴ� Scanner��� ��ü(��ǰ)�� ���� ������(�ܿ� �ʿ� ����)
		Scanner sc = new Scanner(System.in);

		
		//���� a �Է��ϵ��� ��.
		System.out.print("���� a : ");
		int a = sc.nextInt();
		
		
		//���� b �Է��ϵ��� ��.
		System.out.print("���� b : ");
		int b = sc.nextInt();

		System.out.println("===============");

		if (a > b) {
			System.out.println("a�� �� Ů�ϴ�.");
		} else if (a < b) {
			System.out.println("b�� �� Ů�ϴ�.");
		} else {
			System.out.println("�� ���� �����ϴ�.");
		}

		sc.close();
	}
}
