package com.teng.factoryMethod.Sample.framework;

public abstract class Factory {
	public final Product create(String owner){
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	protected abstract void registerProduct(Product product);
	protected abstract Product createProduct(String owner);
}
