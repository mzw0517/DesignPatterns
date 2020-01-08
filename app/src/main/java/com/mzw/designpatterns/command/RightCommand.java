package com.mzw.designpatterns.command;

public class RightCommand implements ICommand{
    @Override
    public String excute() {
        return "向右";
    }
}
