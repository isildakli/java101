package com.java101;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Finding Even Numbers

//        System.out.println("insert an integer . . .");
//        int number = input.nextInt();
//        for (int i = 0; i <= number; i+=2){
//            System.out.println(i);
//        }

        // Sum of Even Numbers

//        int num,total = 0 ;
//
//        do{
//            System.out.println("write a number . . .");
//            num = input.nextInt();
//            total = total + num;
//            System.out.println("Total of even numbers : "+ total);
//        }while(num % 2 == 0);
//        System.out.println("---end---");

        // Exponentials of 4 and 5

//        System.out.println("write the power . . .");
//        int till = input.nextInt();
//        int k =1,l=1;
//
//        for (int i = 1; i <= till; k*=4){
//            System.out.print(k);
//            System.out.print("--");
//            ++i;
//        }
//        System.out.println(" ");
//        for (int a = 1; a <= till; l*=5){
//            System.out.print(l);
//            System.out.print("--");
//            ++a;
//        }

        // Combination Calculation  "C(n,r) = n! / (r! * (n-r)!"

//        System.out.println("write the n. . .");
//        int n = input.nextInt();
//        System.out.println("write the r . . .");
//        int r = input.nextInt();
//
//        int fact1=0,fact2=0,fact3=0;
//        for (int i = 2; i <= n; i++) {
//            fact1 = fact1 * i;
//        }
//        for (int i = 2; i <= r; i++) {
//            fact1 = fact1 * i;
//        }
//        for (int i = 2; i <= n-r; i++) {
//            fact3 = fact3 * i;
//        }
//
//        System.out.println(fact1/(fact2*(fact3)));

        // Sum of Digits of a Number

//        int total = 0, remain =0;
//        System.out.println("write the nunber . . .");
//        int number = input.nextInt();
//
//        int length = 0;
//        long temp = 1;
//        while (temp <= number) {
//            length++;
//            temp *= 10;
//        }
//
//        for (int i = 0; i < length; i++) {
//
//           remain = remain + number % 10 ;
//           number = number / 10 ;
//        }
//
//        System.out.println(remain);

        // Harmonic Series

//        int sum = 1;
//        System.out.println("write the border (1 -> ...)");
//        int number = input.nextInt();
//        if (number > 0){
//
//            for (int i = 1; i <= number; i++) {
//
//                if (number == 1) {break;}
//                sum = sum + 1/i ;
//            }
//        }

        // Star Triangle

//        Scanner klavye = new Scanner(System.in);
//        System.out.println("Bir Sayı Giriniz :");
//        int n = klavye.nextInt();
//
//        for (int i = 0; i <= n ; i++) {
//            for (int j = 0; j < (n - i); j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i + 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//
//        for (int i = n-1; i >-1  ; i--) {
//            for (int j = (n - i); j > -1; j--) {
//                System.out.print(" ");
//            }
//            for (int k = (2 * i + 1); k > 0; k--) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }




    }
}
