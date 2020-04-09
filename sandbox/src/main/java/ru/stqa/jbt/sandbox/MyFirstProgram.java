package ru.stqa.jbt.sandbox;

public class MyFirstProgram {


        public static void main (String[] args ) {
            hello("Рамиль");
            double len = 5;
            double a = 4;
            double b = 3;
            System.out.println(area(len));
            System.out.println(area(a,b));
        }

        public static void hello(String name) {

            System.out.println("Привет," + name);
        }

        public static double area (double l){
            return l*l;
        }
        public static double area (double a, double b){
            return a*b;
        }

 }



