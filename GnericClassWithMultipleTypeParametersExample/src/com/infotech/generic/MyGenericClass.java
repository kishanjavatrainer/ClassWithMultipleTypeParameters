package com.infotech.generic;

public class MyGenericClass<T, U> {

	private T t;
	private U u;
	
	public MyGenericClass(T t, U u) {
		super();
		this.t = t;
		this.u = u;
	}

	public T getT() {
		return t;
	}

	public U getU() {
		return u;
	}
}
