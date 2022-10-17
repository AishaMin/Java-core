package Homework.Homework11;

import java.util.Arrays;

public class Application {
    //в методе main перебрать массив с элементами перечисления, вывести массу, радиус и название каждой планеты
    public static void main(String[] args) {

        Planet[] planets = Planet.values();

        for (Planet planet:planets) {
            System.out.println("Planet " + planet.getName() + "; radius " + planet.getRadius() + "; weight" + planet.getWeight());
        }
        }
    }


