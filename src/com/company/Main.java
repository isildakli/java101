package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Average Calculation
        int phy, math, chem, tur, his, mus;


        Scanner input = new Scanner(System.in);
        System.out.print("phy grade?");
        phy = input.nextInt();

        System.out.print("chem grade?");
        chem = input.nextInt();

        System.out.print("tur grade?");
        tur = input.nextInt();

        System.out.print("math grade?");
        math = input.nextInt();

        System.out.print("his grade?");
        his = input.nextInt();

        System.out.print("mus grade?");
        mus = input.nextInt();

        double result = (phy +chem +tur +math +his +mus)/6.0;

        String message = (result >= 60) ? " you pass" : " you fail";
        System.out.print(message);

    }
}
