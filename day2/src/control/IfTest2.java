package control;

public class IfTest2 {

	public static void main(String[] args) {

		String id = "lenassi15";
		int pw = 2000;

// �ٸ� ��� �׽�Ʈ��� : �Ʒ� 2�� �ּ� Ǯ�� 
// id = "kbinsure";
// pw = 1000;

		// id�� pw�� ��ġ�ϸ� ����α���, �ٸ��� ��ġ���� �ʴ´ٴ� ���� ���
		
		//equals : String ��ġ , && : and , == : ����
		if (id.equals("lenassi15") && pw == 2000) {
			System.out.println("���������� �α��εǾ����ϴ�.");
		} else {
			System.out.println("ID �Ǵ� �н����尡 ��ġ���� �ʽ��ϴ�.");
		}

	}

}
