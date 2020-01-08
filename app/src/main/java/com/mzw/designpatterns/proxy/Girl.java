package com.mzw.designpatterns.proxy;

import com.mzw.designpatterns.L;

/**
 * 被代理者
 * 女孩子一般喜欢买东西
 */
public class Girl implements IPurchase {

    @Override
    public String purchase() {
        return "我想买Supreme联名球鞋";
    }
}
