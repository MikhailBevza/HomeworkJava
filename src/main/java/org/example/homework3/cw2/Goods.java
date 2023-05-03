package org.example.homework3.cw2;

public class Goods {
    String name;
    String country;
    Double weight;
    Double price;
    Integer grade;

    public Goods(String name, String country, Double weight, Double price, Integer grade) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", grade=" + grade +
                '}';
    }
}
