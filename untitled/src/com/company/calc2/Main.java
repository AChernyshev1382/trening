package com.company.calc2;

public class Main {


    public static void main(String[] args){

        Operacionist op = new Operacionist(3, 4);
        System.out.println(op.getSum());
        System.out.println(op.getSum().getOpType());
        System.out.println(op.getSum().getRes());
        System.out.println(op.getSum().isFlag());

        op = null;

    }
}
