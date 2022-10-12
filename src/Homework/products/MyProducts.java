package Homework.products;

//Свойства: максимальное количество белков / жиров / углеводов / калорий / список продуктов (массив)
//Реализовать метод, который принимает на Продукт и добавляет его в список, если характеристики продукта полностью
// соответствуют заявленным разрешениям, в противном случае сообщить, по какой причине продукт не может быть добавлен
// в список (например, слишком большое содержание калорий)
//Реализовать метод, который выводит названия всех продуктов из списка

import java.util.Arrays;

public class MyProducts {
    public int maxProteins;
    public int maxFats;
    public int maxCarbs;
    public int maxCalories;
    public String[] productsList;

    public void setProductsList(Product product){
        for (int i = 0; i < productsList.length; i++) {
            if (productsList[i] == null && product.calories <= maxCalories && product.fat <= maxFats && product.proteins <= maxProteins
            && product.carb <= maxCarbs) {
                productsList[i] = product.toString();
            } else System.out.println("Слишком сытно для тебя:(");
        }

    }

    public void setProductsList(){
        System.out.println(Arrays.toString(productsList));
    }
}
