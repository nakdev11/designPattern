package factory.idcard;

import factory.framework.Factory;
import factory.framework.Product;

public class Main {

	public static void main(String[] args) {

		Factory factory = new IDCardFactory();
		Product card1 = factory.create("太郎");
		Product card2 = factory.create("次郎");
		Product card3 = factory.create("三郎");
		card1.use();
		card2.use();
		card3.use();
	}
}
