package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
                Create a test for that.*/
        String first = "reklama";
        String second = "karamel";
        System.out.println(isAnagram(first, second));
    }

    public static boolean isAnagram (String possibleAnagram, String comparationAnagram) {
        if (possibleAnagram.length() != comparationAnagram.length()) {
            return false;
        }
        char[] posAnagram = possibleAnagram.toCharArray();
        char[] comAnagram = comparationAnagram.toCharArray();
        Arrays.sort(posAnagram);
        Arrays.sort(comAnagram);
        for (int i = 0; i < possibleAnagram.length(); i++) {
            if (posAnagram[i] != comAnagram[i]) {
                return false;
            }
        }
        return true;
    }
}
