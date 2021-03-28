package Template;

public class Main {

	public static void main(String[] args) {

		AbstractDisplay d1 = new CharDisplay('X');
		d1.display();

		System.out.println();

		AbstractDisplay d2 = new StringDisplay("hello, world");
		d2.display();

	}
}
