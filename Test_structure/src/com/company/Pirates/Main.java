package com.company.Pirates;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap newMap = mostCommonChars("src\\com\\company\\Common_Chars\\text.txt");
        System.out.println(Arrays.asList(newMap));


    }
    public static HashMap mostCommonChars (String filename) {
        Path path = Paths.get(filename);
        List<String> lines = new ArrayList<>();
        try {
           lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("cannot read file");
        }
        StringBuilder allText = new StringBuilder();
        for (String line : lines) {
            allText.append(line);
        }
        String text = allText.toString();
        char[] c = text.toCharArray();
        HashMap <Character, Integer> chars = new HashMap<>();
        for (Character a : c) {
            if (chars.containsKey(a)){
                chars.put(a, chars.get(a) +1);
            } else {
                chars.put(a, 1);
            }

        }
        HashMap <Character, Integer> results = new HashMap<>();
        char result;
        result = (getMaxKey(chars));
        results.put(result, chars.get(result));
        chars.remove(result);
        result = (getMaxKey(chars));
        results.put(result, chars.get(result));

        return results;
    }

    public static char getMaxKey(Map<Character, Integer> map) {
        int max = 0;
        int currValue;
        char maxChar = 0;
        for (char c : map.keySet()) {
            currValue = map.get(c);
            if (currValue > max) {
                max = currValue;
                maxChar = c;
            }
        }
        return maxChar;
    }
}
