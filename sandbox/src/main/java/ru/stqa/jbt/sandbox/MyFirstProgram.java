package ru.stqa.jbt.sandbox;

public class MyFirstProgram {


    public static void main(String[] args) {
        hello("Рамиль");
        Square s = new Square(5);
        Rectandle r = new Rectandle(3, 4);
        System.out.println(s.area());
        System.out.println(r.area());
    }

    public static void hello(String name) {

        System.out.println("Привет," + name);
    }

}




