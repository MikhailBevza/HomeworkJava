package org.example.homework3.cw1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = getProduct();
        Double maxPrice = maxPriceOfProduct(products);
        if (maxPrice == 0){
            System.out.println("Товары с заданными параметрами отсутствуют");
        }else{
            System.out.println("maxPrice = " + maxPrice);
        }
    }

    public static List<Product> getProduct(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("Мука высший", 99.89, 1));
        products.add(new Product("Сосиски", 108.15, 2));
        products.add(new Product("Хлеб высший", 66.40, 3));
        products.add(new Product("Сыр высший", 234.54, 2));
        products.add(new Product("Шоколад", 39.99, 1));
        products.add(new Product("Яйца высший", 45.87, 3));
        products.add(new Product("Кетчуп", 134.59, 4));
        products.add(new Product("Хлопья", 29.99, 1));
        return products;
    }

    public static Double maxPriceOfProduct(List<Product> product){
        Double maxPrice = 0.0;
        for (Product prod: product){
            if (prod.nameOfProduct.contains("высший")) {
                if (prod.grade == 1 || prod.grade == 2) {
                    if (maxPrice < prod.price) {
                        maxPrice = prod.price;
                    }
                }
            }
        }
        return maxPrice;
    }
}
