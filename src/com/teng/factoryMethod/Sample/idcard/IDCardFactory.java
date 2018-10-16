package com.teng.factoryMethod.Sample.idcard;
import com.teng.factoryMethod.Sample.framework.Factory;
import com.teng.factoryMethod.Sample.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
	private List owners = new ArrayList<>();
	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}
	public List getOwners(){
		return owners;
	}
}
