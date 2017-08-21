package com.chen.proxy;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String args[]) {
		Subject s = new SubjectProxy(new RealSubject());
		s.request(3);
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		System.out.println("---------------------------");
		dynamicProxy();
	}

	public static void dynamicProxy() {
		Subject realSubject = new RealSubject();

		Subject subjectProxy = (Subject) Proxy.newProxyInstance(
				realSubject.getClass().getClassLoader(),
				realSubject.getClass().getInterfaces(), 
				new InvocationSubject(realSubject));

		/**
		 * Returns an instance of a proxy class for the specified interfaces
		 * that dispatches method invocations to the specified invocation
		 * handler.
		 */
		subjectProxy.request(1);
	}
}
