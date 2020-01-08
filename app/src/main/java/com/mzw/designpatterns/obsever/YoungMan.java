package com.mzw.designpatterns.obsever;

import com.mzw.designpatterns.L;

import java.util.Observable;
import java.util.Observer;

public class YoungMan implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        L.d(arg+"，年轻任性，要风度不要温度");
    }
}
