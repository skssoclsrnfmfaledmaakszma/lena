package control;

import java.util.Date;

public class SwitchTest4 {

	public static void main(String[] args) {
		// switch��
		// ���� �����ͼ� ������ ������(case�� ����Ἥ �ѹ��� break ����)

		// ���ڿ� ���� ������ ��� �ִ� ��ü(��ǰ), �ܿ� �ʿ� ����
		Date date = new Date();

		// ���� ���� ������(�ش� ��ü�� ���� 0~11�� ǥ���Ǿ��־� 1�� ���������)
		int month = date.getMonth() + 1;
		// �� ���
		System.out.println(month+"��");

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ�");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
			
		
		default:
			System.out.println("����");
			break;
		}

	}
}
