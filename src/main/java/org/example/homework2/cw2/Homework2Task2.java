package org.example.homework2.cw2;

import java.util.Scanner;

public class Homework2Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (ascendingSequence(n, scanner)){
            System.out.println("Последовательность является возрастающей");
        }else {
            System.out.println("Последовательность не является возрастающей");
        }
    }


    /**
     *
     * @param n - количество чисел в последовательности
     * @return - является ли последовательность возрастающей
     */
    public static boolean ascendingSequence(int n, Scanner scanner){
        int a = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int b = scanner.nextInt();
            if (b > a){
                count++;
            }
            a = b;
        }
        if (count == n - 1){
            return true;
        }else{
            return false;
        }
    }
}
