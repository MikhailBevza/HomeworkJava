package org.example.homework3.cw4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = getNums();
        System.out.println("Минимальное число = " + minNum(nums));
        System.out.println("Максимальное число = " + maxNum(nums));
        System.out.println("Среднее арифметическое = " + averageFromList(nums));

    }

    public static List<Integer> getNums(){
        List<Integer> nums = new ArrayList<>();
        nums.add(87);
        nums.add(45);
        nums.add(22);
        nums.add(13);
        nums.add(66);
        nums.add(89);
        nums.add(65);
        nums.add(70);
        return nums;
    }

    public static Integer minNum(List<Integer> nums){
        Integer minValue = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < minValue){
                minValue = nums.get(i);
            }
        }
        return minValue;
    }

    public static Integer maxNum(List<Integer> nums){
        Integer maxValue = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > maxValue){
                maxValue = nums.get(i);
            }
        }
        return maxValue;
    }

    public static Double averageFromList(List<Integer> nums){
        Double sumNum = 0.0;
        for (int i = 1; i < nums.size(); i++){
            sumNum += nums.get(i);
        }
        Double average = sumNum / nums.size();
        return average;
    }
}
