package com.chen.proxy;

public class SubjectProxy implements Subject{
	private Subject target;

	public SubjectProxy(Subject s) {
	        target = s;
	    }

	public void request(int id) {
		System.out.println("Proxy log : " + id);
		target.request(id);
	}

	public void setTarget(Subject realSubject) {
		this.target = realSubject;
	}
}
