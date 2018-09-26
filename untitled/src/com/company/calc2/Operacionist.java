package com.company.calc2;

public class Operacionist {

    //объявляем переменные
    private double x;
    private double y;
    private Results res;


    //создаем сеттеры
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }



    //создаем геттеры

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    //конструктор

    public Operacionist(double x, double y) {
        this();
        this.x = x;
        this.y = y;
    }

    //конструктор для инициализации переменных
    public Operacionist() {
        this.x = 0;
        this.y = 0;
        this.res = new Results();
    }

    // метод сложения
    public Results getSum() {
        doCalc(x + y);
        return res;
    }

    private void doCalc(double v) {
        res.setRes(v);
        res.setRes(true);
        res.setRes("DIV");
    }

    public Results getDiv(){

        if (y==0){
            res.setRes(-1);
            res.setRes(false);
            res.setRes("DIV");
        }
        else {
            res.setRes(x/y);
            res.setRes(true);
            res.setRes("DIV");
        }
        return res;
    }

    //
    public double getDiv(){
        return -1;
    }





}
