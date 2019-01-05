package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		String[] names = new String[5];

		names[0] = "±è";
		names[1] = "ÀÌ";
		names[2] = "¹Ú";
		names[3] = "Á¶";
		names[4] = "ÇÑ";

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
