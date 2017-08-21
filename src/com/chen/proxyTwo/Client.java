package com.chen.proxyTwo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Client {
	
	
	public static void main(String[] args) {
		SubjectImpl subjectImpl = new SubjectImpl();
		InvocationHandler iHandler = new com.chen.proxyTwo.Proxy(subjectImpl);
		ISubject s  =   (ISubject) Proxy.newProxyInstance(subjectImpl.getClass().getClassLoader()
				, subjectImpl.getClass().getInterfaces(),iHandler);
		s.run();
	}
	
}
