package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        Random random = new Random();
//        int min = 7;
//        int max = 12;
//        for (int i = 0;i<100;i++) {
//            int answer = random.nextInt(max + 1 - min) + min;
//            // bound: {0,6) --> {0,1,2,3,4,5} + 7 from {7-12}
//            System.out.println(answer);
//        }

        // run the returnNumberOfLetters in my SubStringExample.java
        System.out.println(SubStringExample.returnNumberOfLetters("This is Diem's String"));
        System.out.println(SubStringExample.returnRandomString());

    }
}
