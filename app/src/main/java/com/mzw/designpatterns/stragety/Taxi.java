package com.mzw.designpatterns.stragety;

public class Taxi implements Caculator {

    @Override
    public String caculate(int km) {
        // 起步价10元3km 剩下2元/km
        if (km <= 3) {
            return "打车需花费10元";
        } else {
            return "打车需花费" + (10 + (km - 3) * 2) + "元";
        }
    }
}
