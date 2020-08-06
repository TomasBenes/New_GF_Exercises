package com.company;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	    // EXERCISE 1
        /*List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers.stream().filter(number -> number%2 == 0).forEach(number -> System.out.println(number));*/

        // EXERCISE 2
        /*List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers.stream().filter(number -> number >= 0).forEach(number -> System.out.println(number * number));*/

        // EXERCISE 3
        /*List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers.stream().map(number -> number * number).filter(number -> number > 20).forEach(number -> System.out.println(number));
        System.out.println("Original values");
        numbers.stream().filter(number -> number * number > 20).forEach(number -> System.out.println(number));*/

        //EXERCISE 4
       /* List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        System.out.println(numbers.stream().filter(number -> number%2 != 0).mapToInt(Integer::intValue).average());
        */

        //EXERCISE 5
        /*List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        System.out.println(numbers.stream().filter(number -> number%2 != 0).mapToInt(Integer::intValue).sum());*/

        //EXERCISE 6
        /*String text = "HeLLo EverybOdy in THE WorlD";
        text.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isUpperCase)
                .forEach(charUp -> System.out.println(charUp));*/

        //EXERCISE 7
        /*List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        String letter = "N";
        cities.stream().filter(city -> city.startsWith(letter)).forEach(city -> System.out.println(city));*/

        //EXERCISE 8
        /*List<Character> text = Arrays.asList('H','e','l','l','o');
        System.out.println(text.stream()
                .map(character -> character.toString())
                .collect(Collectors.joining()));*/

        //EXERCISE 9
        /*String text = "HeLLo EverybOdy in THE WorlD";
        System.out.println(text.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));*/

        //EXERCISE 10
        Fox fox1 = new Fox("Tomas", "orange", 5);
        Fox fox2 = new Fox("David", "green", 6);
        Fox fox3 = new Fox("Honza", "brown", 1);
        Fox fox4 = new Fox("Pepa", "green", 3);
        Fox fox5 = new Fox("Evicka", "green", 2);
        List<Fox> foxes = new ArrayList<>();
        foxes.add(fox1);
        foxes.add(fox2);
        foxes.add(fox3);
        foxes.add(fox4);
        foxes.add(fox5);

        foxes.stream().filter(fox -> fox.color.equals("green")).forEach(fox -> System.out.println(fox.name));
        System.out.println();
        foxes.stream().filter(fox -> fox.color.equals("green") && fox.age < 5).forEach(fox -> System.out.println(fox.name));
        System.out.println();
        System.out.println(foxes.stream()
                .map(Fox::getColor)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

    }
}
