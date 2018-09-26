package com.company.calc2;

public class Operacionist {

    //объявляем переменные
    private double x;
    private double y;
    private double res;


    //создаем сеттеры
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRes(double res) {
        this.res = res;
    }

    //создаем геттеры

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRes() {
        return res;
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
        this.res = 0;
    }

    // метод сложения
    public double getSum() {
        this.res = x + y;
        return res;
    }

    //
    public double getDiv(){
        this.res = x
    }





}
