package ictgradschool.industry.introtojava.basics.myfirstprogram;

import ictgradschool.industry.introtojava.basics.myfirstprogram.mysecondprogram.MySecondProgram;

public class MyFirstProgram {
    public void start() {
        System.out.println("Hello World");

    }

    public static void main(String[] argS) {

        MySecondProgram p = new MySecondProgram();

        p.start();
    }
}


