package Homework.cats;

public class Mouse {
    //Класс Мышь: скорость.
    private double speed;

    public Mouse (double speed){
         setSpeed (speed);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed < 0 ){
            throw new IllegalArgumentException("скорость не может быть меньше нуля");
        }
        this.speed = speed;
    }
}
