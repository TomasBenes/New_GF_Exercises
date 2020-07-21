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

        for (int i = 0; i < chars.values().size(); i++) {
            int maxValue = (Collections.max(chars.values()));
        }






        return chars;
    }
}
