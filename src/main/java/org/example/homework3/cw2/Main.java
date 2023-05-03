package org.example.homework3.cw2;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer gradeOfGoods = 2;
        List<Goods> goods = getGoods();
        //System.out.println(goods);
        List<String> nameOfGoods = getNameOfGoods(goods, gradeOfGoods);
        System.out.println(nameOfGoods);
    }


    public static List<Goods> getGoods(){
        List<Goods> goods = new ArrayList<>();
        goods.add(new Goods("подушка", "Россия", 0.57, 597.89, 2));
        goods.add(new Goods("одеяло", "Россия", 2.56, 1234.79, 1));
        goods.add(new Goods("перчатки", "Беларусь", 0.12, 99.99, 2));
        goods.add(new Goods("стул", "Украина", 2.15, 99.99, 2));
        goods.add(new Goods("игрушка", "Китай", 0.45, 197.89, 3));
        goods.add(new Goods("тетрадь", "Россия", 0.05, 17.79, 1));
        goods.add(new Goods("ручка", "Беларусь", 0.05, 99.99, 2));
        goods.add(new Goods("утюг", "Китай", 1.64, 2590.89, 1));
        return goods;
    }

    /**
     *
     * @param goods - список товаров;
     * @param gradeOfGoods - заданный сорт товара;
     * @return - список наименований товаров с необходимыми критериями;
     */
    public static List<String> getNameOfGoods(List<Goods> goods, Integer gradeOfGoods){
        Double minPrice = 1000000000.00;
        List<String> nameOfGoods = new ArrayList<>();
        for (int i = 0; i < goods.size(); i++) {
            if (goods.get(i).grade == gradeOfGoods){
                if (goods.get(i).price < minPrice){
                    minPrice = goods.get(i).price;
                }
            }
        }
        Double minDiff = 0.0000000001;
        for (int i = 0; i < goods.size(); i++) {
            if (goods.get(i).grade == gradeOfGoods){
                if (goods.get(i).price - minPrice < minDiff) {
                    nameOfGoods.add(goods.get(i).name);
                }
            }
        }
        return nameOfGoods;
    }
}
