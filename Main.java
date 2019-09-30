package com.company;

public class Main {

    //Define a method, maxOfTwoNumbers(), that takes two numbers as arguments and returns the largest of them.
    private static int maxOfTwoNumbers(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            System.out.println(numberOne);
            return numberOne;
        } else {
            System.out.println(numberTwo);
            return numberTwo;
        }
    }

    //Define a method, maxOfThree(), that takes three numbers as arguments and returns the largest of them.
    private int maxOfThree(int numberOne, int numberTwo, int numberThree) {
        if ((numberOne > numberTwo) && (numberOne > numberThree)) {
            System.out.println(numberOne);
            return numberOne;
        } else if ((numberTwo > numberOne) && (numberTwo > numberThree)) {
            System.out.println(numberTwo);
            return numberTwo;
        } else {
            System.out.println(numberThree);
            return numberThree;
        }
    }

    //Write a method, isCharacterAVowel(), that takes a character (i.e., a string of length 1) and returns true if it's a vowel and false otherwise.
    private static boolean isCharacterAVowel(String letter) {
        if ((letter == "a") || (letter == "e") || (letter == "i") || (letter == "o")|| (letter == "u")) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    // Write a method that returns the number of arguments passed to it when called.
    private static void numberOfArgumentsPassed(int... args) {
        System.out.println(args.length);
    }

    //Define a method, reverseString(), that computes the reversal of a string. For example, reverseString("jag testar") should return the string "ratset gaj".
    private static String reverseString(String userInput) {
        String newReverseWord = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            newReverseWord += userInput.charAt(i);
        }
        System.out.println(newReverseWord);
        return newReverseWord;
    }

    public static void main(String[] args) {
	    // maxOfTwoNumbers
        maxOfTwoNumbers(5, 2);
        maxOfTwoNumbers(4, 10);

        //maxOfThree
        Main instance = new Main();
        instance.maxOfThree(5, 11, 10);
        instance.maxOfThree(8, 2, 17);

        //isCharacterAVowel
        isCharacterAVowel("f");

        //numberOfArgumentsPassed
        numberOfArgumentsPassed(1, 2, 3);

        //reverseString
        reverseString("jag testar");
    }

}



