package com.chen.proxy;

public class RealSubject implements Subject {
	public void request(int id) {
		System.out.println("RealSubject.request : " + id);
	}
}
