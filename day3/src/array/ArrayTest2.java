package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		String[] names = new String[5];

		names[0] = "��";
		names[1] = "��";
		names[2] = "��";
		names[3] = "��";
		names[4] = "��";

//		System.out.println(names.length);
//		System.out.println(names[names.length-1]);

		double[] eyes = new double[3];
		eyes[0] = 0.1;
		eyes[1] = 1.0;
		eyes[2] = 1.2;

		System.out.println(eyes[0]);
		System.out.println(eyes[eyes.length - 1]);

	}

}
