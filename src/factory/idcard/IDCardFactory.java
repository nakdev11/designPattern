package factory.idcard;

import java.util.ArrayList;
import java.util.List;

import factory.framework.Factory;
import factory.framework.Product;

public class IDCardFactory extends Factory {

	private List<String> owners = new ArrayList<>();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}

	protected List<String> getOwners() {
		return owners;
	}

}
