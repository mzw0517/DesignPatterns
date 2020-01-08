package com.mzw.designpatterns.obsever;


import java.util.Observable;

public class Weather extends Observable {

    public void temperatureDown(String s){
        setChanged();
        notifyObservers(s);
    }
}
