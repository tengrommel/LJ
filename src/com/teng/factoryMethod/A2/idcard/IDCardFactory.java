package com.teng.factoryMethod.A2.idcard;

import com.teng.factoryMethod.A2.framework.Factory;
import com.teng.factoryMethod.A2.framework.Product;

import java.util.HashMap;

public class IDCardFactory extends Factory {
	private HashMap database = new HashMap();
	private int serial = 100;
	protected synchronized Product createProduct(String owner){
		return new IDCard(owner, serial++);
	}

	protected void registerProduct(Product product) {
		IDCard card = (IDCard)product;
		database.put(new Integer(card.getSerial()), card.getOwner());
	}
	public HashMap getDatabase(){
		return database;
	}
}
