package org.example.homework1.cw2;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность: ");
        System.out.println(sumDiff(scanner));
        scanner.close();
    }

    /**
     *
     * @return - сумма положительных чисел идущих перед отрицательными
     */
    public static int sumDiff(Scanner scanner){
        int a = scanner.nextInt();
        int sum = 0;
        while (a != 0){
            int b = scanner.nextInt();
            if (a > 0 && b < 0){
                sum += a;
            }
            a = b;
        }
        return sum;
    }
}
