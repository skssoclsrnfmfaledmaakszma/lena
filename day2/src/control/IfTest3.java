package control;

import java.util.Scanner;


public class IfTest3 {

	public static void main(String[] args) {
		// ID/PW �Է¿��� �Ǵ�

		// �� ID/PW�� lenassi15 // 15 ��.
		String id = "lenassi15";
		int pw = 15;

		// Ű���带 �Է��ϴ� Scanner��� ��ü(��ǰ)�� ���� ������(�ܿ� �ʿ� ����)
		Scanner sc = new Scanner(System.in);

		// ID�� �Է��ϼ���
		System.out.print("ID�Է�â : ");

		// Ű����� �Է��� sc.next()��� ���� input�̶�� String(���ڿ�)�� ����
		String idInput = sc.next();

		// ����(ctrl+f11)�� �� console â�� ID�Է�â�� �Է��� ID�� ���
		System.out.println("����� ���̵�� " + idInput + "�Դϴ�.");

		// PW�� �Է��ϼ���
		System.out.print("PW�Է�â : ");
		// Ű����� �Է��� sc.nextInt()��� ���� pwInput�̶�� int(����)�� ����
		int pwInput = sc.nextInt();

		// pw�Է�â�� �Է��� pw�� ���
		System.out.println("����� PW�� " + pwInput + "�Դϴ�.");

		// Ű����� �Է��� input���� �� ID/PW�� ��ġ�ϴ��� Ȯ���ϴ� ���ǹ�
		if (idInput.equals(id) && pwInput == pw) {
			System.out.println("���������� �α��εǾ����ϴ�.");
		} else {
			System.out.println("ID �Ǵ� PW�� ��ġ���� �ʽ��ϴ�.");
		}
		
		sc.close();
	}
}
