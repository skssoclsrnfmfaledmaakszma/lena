package control;

public class WhileTest3for {

	public static void main(String[] args) {
		// for��(�ݺ���)
		// 1���� 100���� ����

		// ���� ���� ������ ��
		int sum = 0;

		// i = 1(ó�� ��) ; i�� 101���� ���������� ; i�� 1�� ����
		for (int i = 1; i < 100; i++) {
		
		// sum�� 1�� ���ϰ�, �ݺ��ؼ� 2�� ���ϰ� .... 100���� ����
			sum = sum + i;

		}
		
		System.out.println(sum);

	}
}
