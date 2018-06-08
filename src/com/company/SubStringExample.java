package com.company;

public class SubStringExample {

    public static void main(String[] args) {
        String myString ="Hello";
        String myOtherString = "Elephant";
        // elephant => lephanteay
        // animal => nimalaay

//        for (int i=0; i<myString.length(); i++) {
//            System.out.println(i + "\t" + myString.charAt(i));
//        }

        String firstLetter = myString.substring(0,1);
        String restOfWord = myString.substring(1, myString.length());

        System.out.println("Get first letter of my word: " + firstLetter);
        System.out.println("Rest of the word: " + restOfWord);
        System.out.println(restOfWord + firstLetter);
//        System.out.println(myString.substring(0, 5)); // 0,1,2,3,4 = H e l l o
//        System.out.println(myString.substring(5, 10)); // 5,6,7,8,9 =
//        System.out.println(myString.substring(10,15));

        // 1. split the user input into words .split()
        String sample = "This is my string";
        String[] tempSplit = sample.split(" ");
        // tempSplit[] = {"This", "is", "my", "string"}
        // tempSplit[0] = {"This"}

        String firstLetterInWord;
        String restOfTheWord;

        for (int i=0; i<tempSplit.length; i++) {
            // replacement conditions
            for (int j=0; j<tempSplit[i].length(); j++) {
                // execute the pig latin
            }

        }
        // 2. get the first letter of the word = myString.substring(0,1);
        // 3. store that letter in a variable
        // 4. store the rest of the word in another variable
        // 4. create a new string and recombine your letters

    }

    public static int returnNumberOfLetters(String thisString) {
        String myString = thisString;
        int counter = 0;

        for (int i=0; i<myString.length(); i++) {
            if (myString.charAt(i)!=' ') {
                counter++;
            }
        }

        return counter;
    }

    public static String returnRandomString() {
        return "This is random";
    }

}
