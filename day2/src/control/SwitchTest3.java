package control;

import java.util.Date;

public class SwitchTest3 {

	public static void main(String[] args) {
		// switch��
		//���ڸ� �����ͼ� ������ �����

		// ���ڿ� ���� ������ ��� �ִ� ��ü(��ǰ), �ܿ� �ʿ� ����
		Date date = new Date();

		// �ð��� ������(��Ҽ� - ������ ��ǰ�� ���..����ص� ������ ����)
		int hour = date.getHours();
		// ���� ������
		int min = date.getMinutes();
		// �ʸ� ������
		int sec = date.getSeconds();
		// ��:��:�� ���
		System.out.println(hour + ":" + min + ":" + sec);

		// ���� ������(�ش� ��ü�� ���� 0~11�� ǥ���Ǿ��־� 1�� ���������)
		int month = date.getMonth() + 1;
		// �� ���
		System.out.println(month+"��");

		// ������ ������
		int day = date.getDay();
		
		

		switch (day) {
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("ȭ");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("��");
			break;
		case 5:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;
		default:
			System.out.println("��");
			break;
		}

	}
}
