package com.mzw.designpatterns.command;

public class DownCommand implements ICommand{
    @Override
    public String excute() {
        return "快速下落";
    }
}
