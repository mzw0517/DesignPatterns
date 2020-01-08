package com.mzw.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PurchaseHandler implements InvocationHandler {

    private Object obj;

    public PurchaseHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 调用被代理类的方法
        Object invoke = method.invoke(obj, args);
        return invoke;
    }
}
