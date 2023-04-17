package org.example.homework1.cw1;

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Введите строку: ");
        String str = reverseWords(scanner.nextLine());
        System.out.println(str);
    }

    /**
     *
     * @param str - Вводимая строка
     * @return - итоговая развернутая строка
     */
    public static String reverseWords(String str){
        String[] words = str.split(" ", 0);
        String[] reverseArrWords = reverseArray(words);
        String resuitString = reverseArrWords[0];
        for (int i = 1; i < reverseArrWords.length; i++) {
            if (reverseArrWords[i] != "") {
                resuitString += " " + reverseArrWords[i];
            }
        }
        return resuitString;
    }

    /**
     *
     * @param array - массив слов
     * @return - возвращаем развернутый мвссив
     */
    public static String[] reverseArray(String[] array){
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
