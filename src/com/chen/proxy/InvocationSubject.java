package com.chen.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationSubject implements InvocationHandler {
    Subject target;

    public InvocationSubject(Subject subject) {
        target = subject;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
    	
        System.out.println("log : " + method.getName() + " invoked with " + args);
        return method.invoke(target, args);
    }


}