package com.mzw.designpatterns.stragety;

public class Traffic {

    private Caculator mCaculator;

    public void setCaculator(Caculator caculator) {
        this.mCaculator = caculator;
    }

    public String traffic(int km){
        return mCaculator.caculate(km);
    }
}
