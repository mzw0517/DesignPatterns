package com.mzw.designpatterns.proxy;

/**
 * 代理者 proxy
 * 专职做海外代购的人
 */
public class OverseaPurchser implements IPurchase {

    // 持有被代理人的引用
    private IPurchase mPurchaser;

    public OverseaPurchser(IPurchase purchaser) {
        this.mPurchaser = purchaser;
    }

    public void setPurchaser(IPurchase purchaser) {
        this.mPurchaser = purchaser;
    }

    @Override
    public String purchase() {
        return mPurchaser.purchase();
    }
}
