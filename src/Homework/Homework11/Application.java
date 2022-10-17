package Homework.Homework11;

import java.util.Arrays;

public class Application {
    //в методе main перебрать массив с элементами перечисления, вывести массу, радиус и название каждой планеты
    public static void main(String[] args) {

        Planet[] planets = Planet.values();
        System.out.println(Arrays.toString(planets));
        }
    }
     

