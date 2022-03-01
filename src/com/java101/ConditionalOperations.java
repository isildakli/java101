package com.java101;

import java.util.Objects;
import java.util.Scanner;

public class ConditionalOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Calculator -->

//        int result = 0;
//        System.out.print("first number?");
//        int first = input.nextInt();
//
//        System.out.print("second number?");
//        int second = input.nextInt();
//
//        System.out.print("which operation?");
//        String operation = input.next();
//
//        if (operation == "+")
//            result = first+second;
//        if (operation == "-")
//            result = first-second;
//        if (operation == "*")
//            result = first*second;
//        if (operation == "/")
//            result = first/second;
//
//        System.out.println("Result is : " + result);

        // User login -->

//        String username, password = "123456";
//
//
//        System.out.print("username?");
//        username = input.nextLine();
//
//        System.out.print("password?");
//        String password_user = input.nextLine();
//
//        if (!Objects.equals(password, password_user)){
//            System.out.println("password is wrong ,do you want to change it?");
//            System.out.print("password?");
//            String password_new = input.nextLine();
//            if (password != password_new && password_new != password_user){
//                System.out.print("password is changed successfully");
//            }
//            else
//                System.out.print("password is not changed!");
//
//        }

        //  Pass or Fail --->

//        int phy, math, chem, tur, mus,total=0;
//
//
//        System.out.print("phy grade?");
//        phy = input.nextInt();
//        if (phy < 101 && phy > -1)
//            total = total + phy;
//
//        System.out.print("chem grade?");
//        chem = input.nextInt();
//        if (chem < 101 && chem > -1)
//            total = total + chem;
//
//        System.out.print("tur grade?");
//        tur = input.nextInt();
//        if (tur < 101 && tur > -1)
//            total = total + tur;
//
//        System.out.print("math grade?");
//        math = input.nextInt();
//        if (math < 101 && math > -1)
//            total = total + math;
//
//        System.out.print("mus grade?");
//        mus = input.nextInt();
//        if (mus < 101 && mus > -1)
//            total = total + mus;
//
//        double result = total/6.0;
//
//        String message = (result >= 60) ? " you pass" : " you fail";
//        System.out.print(message);


        // Activities Dependent on Whether Condition

//        int temperature;
//
//        System.out.print("What is temperature?");
//        temperature = input.nextInt();
//
//        if (temperature < 5)
//            System.out.print("it is time to ski");
//        if (temperature >= 5 && temperature <= 15)
//            System.out.print("it is time to cinema");
//        if (temperature >= 15 && temperature <= 25)
//            System.out.print("it is time to picnic");
//        else
//            System.out.print("it is time to swim");


        // Order from the Biggest the Smallest

//        System.out.print("first number?");
//        int first = input.nextInt();
//        System.out.print("second number?");
//        int second = input.nextInt();
//        System.out.print("third number?");
//        int third = input.nextInt();
//
//        if(first > second && first > third){
//            if (second > third)
//                System.out.print(first+">"+second+">"+third);
//            else
//                System.out.print(first+">"+third+">"+second);
//        }
//
//        else if (second > third){
//            if (first > third)
//            System.out.print(second+">"+first+">"+third);
//            else
//                System.out.print(second+">"+third+">"+first);
//        }
//
//        else {
//            if (first > second)
//                System.out.print(third+">"+first+">"+second);
//            else
//                System.out.print(third+">"+second+">"+first);
//        }


        // Horoscope Finding


    }
}
