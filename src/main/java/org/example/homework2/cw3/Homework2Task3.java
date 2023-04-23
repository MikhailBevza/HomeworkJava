package org.example.homework2.cw3;

public class Homework2Task3 {
    public static void main(String[] args) {
        int[] arrayNums = new int[]{-1, 2, 10, -5, 44, 23, -52, 3, 66};
        printArray(arrayNums);
        replacingArrayElements(arrayNums);
        printArray(arrayNums);
    }


    /**
     *
     * @param array - массив целых чисел
     * @return - массив, в котором заменили отрицательные элементы на сумму индексов двузначных элементов массива
     */
    public static int[] replacingArrayElements(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > 9 && Math.abs(array[i]) < 100){
                sum += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                array[i] = sum;
            }
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int num: array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
