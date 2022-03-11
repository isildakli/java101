package com.java101;

public class HarmonicAveage {

    public static void main(String[] args) {
        double [] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(1 / numbers[i]);
            sum = sum + (1/numbers[i]);
        }

        System.out.println(numbers.length/sum);
    }
}
