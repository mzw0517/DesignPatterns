package com.mzw.designpatterns.command;

public class LeftCommand implements ICommand{
    @Override
    public String excute() {
        return "向左";
    }
}
