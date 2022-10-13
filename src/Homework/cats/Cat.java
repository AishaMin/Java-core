package Homework.cats;
//Класс Кот: имя, скорость, вес, пойманные мыши;
//Кот хранит информацию о пойманных мышах (максимум о 100).
//Кот ловит мышь, только, если его скорость выше, чем у мыши.
//Кот может напасть на другого кота и, если он больше противника (по весу),
//то может отобрать его мышей (если скорость мыши выше, чем скорость кота, она убежит).
public class Cat {
  private String name;
  private int speed;
  private int weight;
  private Mouse [] mice = new Mouse[100];
  private int mouseCount;

  public Cat(String name, int speed, int weight, int mouseCount){
      if (name == null) {
          throw new IllegalArgumentException("Имя не может быть null");
      } else if (speed < 0 || weight < 0 || mouseCount < 0) {
          throw new IllegalArgumentException("Скорость и/или вес и/или количество пойманных мышей не может быть меньше ноля");
      }
      this.name = name;
      this.speed = speed;
      this.weight = weight;
      this.mouseCount = mouseCount;
  }

  public void catMouse (Mouse mouse) {
      if (mouseCount > mice.length){
          System.out.println("Кот поймал уже много мышей, он спит");
      }
      if (speed > mouse.getSpeed()){
          System.out.println("+1 мышь");
          mice [mouseCount] = mouse;
          mouseCount++;
      } else
      System.out.println("Эта мышь слишком быстра для этого кота, она убежала");
  }

  public void catBattle (Cat cat){
      if (weight > cat.weight){
          System.out.println("Кошачья победа");
      } else System.out.println("Кошачий проигрыш:(");
  }

}
