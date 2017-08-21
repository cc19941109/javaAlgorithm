package com.chen.proxy;

public class Sabstract extends DefaultBus {

	public void run() {
		System.out.println("run bus");
	}

}

interface IBus {

	void run();

	void stop();

}

abstract class DefaultBus implements IBus {

	public abstract void run();

	public void stop() {
		System.out.println("stop bus ");
	}

}