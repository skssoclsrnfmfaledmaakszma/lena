package array;

public class ArrayTest3 {

	public static void main(String[] args) {

		int[] n = { 100, 200, 300 };
//		System.out.println(n[0]);
//		System.out.println(n.length);

		double[] eye = { 0.1, 0.3, 0.5 };

		
		for (int i = 0; i < eye.length; i++) {
			System.out.println(eye[i]);
		}
		System.out.println("====================");
		// foreach문, d는 eye[0]과 같이 배열 내의 한 값
		for (double d : eye) {
			System.out.println(d);
		}
		System.out.println("====================");
		String[] bro = {"Seo", "Oh", "Cho"};
		
		
		for (int i = 0; i < bro.length; i++) {
			System.out.println(bro[i]);
		}
		
		
		
	}

}
