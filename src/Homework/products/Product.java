package Homework.products;

//Свойства: название продукта / белки / жиры / углеводы / калории
//Минимум 4 конструктора
//Реализовать необходимые проверки входящих данных
//Создать не менее 4 экземпляров данного класса (объектов)
public class Product {
    public String nameProduct;
    public int fat;
    public int proteins;
    public int carb;
    public int calories;



    public Product(String nameProduct) {

        this.nameProduct = nameProduct;
    }


    public void setProteins(int proteins){
        if (proteins < 0){
            throw new IllegalArgumentException("Калории не могут быть отрицательными");
        }
        this.proteins = proteins;
    }

    public  void setFat (int fat){
        if ( fat < 0 ) {
            throw new IllegalArgumentException("Свойства не могут быть менше нуля");
        }
        this.fat = fat;
    }

    public  void setCarb (int carb){
        if (carb < 0) {
            throw new IllegalArgumentException("Свойства не могут быть менше нуля");
        }
        this.carb = carb;
    }

    public void setCalories(int calories){
        if (calories < 0){
            throw new IllegalArgumentException("Калории не могут быть отрицательными");
        }
        this.calories = calories;
    }
}


