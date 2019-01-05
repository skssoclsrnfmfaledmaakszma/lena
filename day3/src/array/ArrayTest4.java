package array;

public class ArrayTest4 {

	public static void main(String[] args) {

//	 	No.1
		int[] n = new int[100];

		n[0] = 100;
		n[54] = 200;
		n[99] = 300;

		System.out.println(n[0]);
		System.out.println(n[54]);
		System.out.println(n[99]);
		System.out.println(n.length);

		System.out.println("==================");

//	 	No.2
		String[] s = new String[100];
		s[0] = "hello";
		s[1] = "java";
		s[99] = "spring";

		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[99]);
		System.out.println(s.length);

	}

}
