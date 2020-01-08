package com.mzw.designpatterns.command;

public class TransCommand implements ICommand {
    @Override
    public String excute() {
        return "改变形状";
    }
}
