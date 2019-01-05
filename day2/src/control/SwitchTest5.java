package control;

import java.util.Date;

public class SwitchTest5 {

	public static void main(String[] args) {
		// switch��
		// ���� �����ͼ� �������� �������� ����(case�� ����Ἥ �ѹ��� break ����)

		// ���ڿ� ���� ������ ��� �ִ� ��ü(��ǰ), �ܿ� �ʿ� ����
		Date date = new Date();

		// ���� ���� ������(�ش� ��ü�� ���� 0~11�� ǥ���Ǿ��־� 1�� ���������)
		int month = date.getMonth() + 1;
		// �� ���
		System.out.println(month+"��");

		switch (month) {
		case 2:
			System.out.println("28�Ϸ� ������ ��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30�Ϸ� ������ ��");
			break;
		default:
			System.out.println("31�Ϸ� ������ ��");
			break;
		}

	}
}
