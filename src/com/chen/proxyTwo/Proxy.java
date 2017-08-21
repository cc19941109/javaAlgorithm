package com.chen.proxyTwo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy implements InvocationHandler{

	private ISubject subject;
	
	public Proxy(ISubject subject) {
		this.subject = subject;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("before run");
		method.invoke(subject, args);
		System.out.println("after run");
		
		return null;
	}

	
	
}
