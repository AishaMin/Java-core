package Homework.products;

//Свойства: название продукта / белки / жиры / углеводы / калории
//Минимум 4 конструктора
//Реализовать необходимые проверки входящих данных
//Создать не менее 4 экземпляров данного класса (объектов)
public class Product {
    public String nameProduct;
    public double fat;
    public double proteins;
    public double carb;
    public double calories;



    public Product(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void characteristics (double calories, double proteins, double fat, double carb){
        if (calories < 0 || proteins < 0 || fat < 0 || carb < 0) {
            throw new IllegalArgumentException("Свойства не могут быть менше нуля");
        }

        this.calories = calories;
        this.proteins = proteins;
        this.fat = fat;
        this.carb = carb;

    }
}


