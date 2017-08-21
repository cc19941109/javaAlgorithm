package com.chen.proxyTwo;

public class SubjectImpl implements ISubject{

	public void run(){
		System.out.println(this.getClass().getName()+" run .....");
	}
	
}
