package Homework.Homework11;

//создать enum, перечисляющий 3 любые планеты солнечной системы
//значения всех свойств задать через конструктор: масса, радиус и название планеты
//реализовать возможность изменить массу и радиус планеты
//в методе main перебрать массив с элементами перечисления, вывести массу, радиус и название каждой планеты
public enum Planet {
    EARTH(6378, 6, "earth"), MARS( 3389, 64,"mars" ), VENUS(6051,4, "venus");

    private int radius;
    private int weight;
    private String name;
    Planet(int radius, int weight, String name) {
        this.radius = radius;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planets{" + name +
                " radius=" + radius +
                ", weight=" + weight +
                '}';
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
