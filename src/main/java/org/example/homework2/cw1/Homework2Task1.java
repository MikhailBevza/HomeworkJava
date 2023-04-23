package org.example.homework2.cw1;

import java.util.Scanner;

public class Homework2Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumNums = sumOfPrimeNums(n, scanner);
        if (sumNums == 0){
            System.out.println("Простых чисел нет");
        }else {
            System.out.println("Сумма простых чисел = " + sumNums);
        }
    }

    /**
     *
     * @param n - количество чисел в последовательности
     * @return - сумму простых чисел
     */
    public static int sumOfPrimeNums(int n, Scanner scanner){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (primeNums(a)){
                sum += a;
            }
        }
        return sum;
    }

    /**
     *
     * @param a - проверяемое число
     * @return - является ли число простым
     */
    public static boolean primeNums(int a){
        if(a < 2){
            return false;
        }
        double rootOfNum = Math.sqrt(a);
        for (int j = 2; j <= rootOfNum; j++) {
            if (a % j == 0) {
                return false;
            }
        }
        return true;
    }
}
