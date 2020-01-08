package com.mzw.designpatterns.stragety;

public class Bus implements Caculator{

    @Override
    public String caculate(int km) {
        // 1元随便坐
        return 1+"元随便坐";
    }
}
