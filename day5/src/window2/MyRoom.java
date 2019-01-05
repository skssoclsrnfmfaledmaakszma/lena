package window2;

public class MyRoom {

	public static void main(String[] args) {

		Dog dog = new Dog();

		dog.leg = 4;
		dog.tail = true;

		dog.bark();
		dog.shake();

		System.out.println(dog.leg);
		System.out.println(dog.tail);
		System.out.println("----------------------------------");

		Tv tv1 = new Tv();

		tv1.shape = "square";
		tv1.stand = true;

		tv1.change(7);
		tv1.turn();
		
		Tv tv2 = new Tv();

		tv2.shape = "diamond";
		tv2.stand = false;

		tv2.change(63);
		tv2.turn();
		

	}

}
