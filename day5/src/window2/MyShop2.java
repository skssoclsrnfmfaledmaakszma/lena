package window2;

import java.util.Scanner;

public class MyShop2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Cal2 cal2 = new Cal2();
		/*
		 * int latte = 5000;
		 * System.out.println("몇잔?"); System.out.print("주문인원 : ");
		 * 
		 * 
		 * 
		 * int peopleNum = sc.nextInt();
		 * 
		 * 
		 * 
		 * int rowPrice = cal2.multiple(peopleNum, latte); int price = 0;
		 * 
		 * if (rowPrice > 20000) { price = rowPrice - 3000; } else { price = rowPrice; }
		 * 
		 * System.out.println("가격 : " + price);
		 */
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		int firstResult = cal2.myCal(a, b);

		int result = firstResult * 100;

		System.out.println("myCal2테스트 : " + result);

	}

}
