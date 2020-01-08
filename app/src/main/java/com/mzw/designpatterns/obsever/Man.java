package com.mzw.designpatterns.obsever;

import com.mzw.designpatterns.L;

import java.util.Observable;
import java.util.Observer;

public class Man implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        L.d(arg+", 要穿秋裤");
    }
}
