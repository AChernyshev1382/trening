package com.company.calc2;

public class Results {

    private double res;
    private boolean flag;
    private String opType = "";

    public String getOpType() {
        return opType;
    }

    public double getRes() {
        return res;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setRes(boolean b) {
    }

    public void setRes(String div) {
    }
}
