package com.mzw.designpatterns.obsever;

import com.mzw.designpatterns.L;

import java.util.Observable;
import java.util.Observer;

public class OldMan implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        L.d(arg+", 还是穿上棉裤吧。。。");
    }
}
