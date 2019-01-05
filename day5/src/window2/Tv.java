package window2;

public class Tv {
// 변수 - 모양, 받침대
// 메소드 - 채널변경, TV켜다

	String shape;
	boolean stand;

	public void change(int ch) {
		System.out.println(ch + "번 채널");
	}

	public void turn() {
		System.out.println("전원버튼");
	}

}
