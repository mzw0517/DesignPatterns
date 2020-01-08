package com.mzw.designpatterns.command;

/**
 * 俄罗斯方块
 */
public class RussiaSquare {

    private ICommand left,right,down,trans;

    public void setDown(ICommand down) {
        this.down = down;
    }

    public void setLeft(ICommand left) {
        this.left = left;
    }

    public void setRight(ICommand right) {
        this.right = right;
    }

    public void setTrans(ICommand trans) {
        this.trans = trans;
    }

    public String moveLeft(){
        return left.excute();
    }

    public String moveRight(){
        return right.excute();
    }

    public String moveDown(){
        return down.excute();
    }

    public String trans(){
        return trans.excute();
    }
}
