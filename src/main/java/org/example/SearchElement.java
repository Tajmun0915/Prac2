package org.example;

import java.util.ArrayList;
import java.util.List;

public class SearchElement {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);

        int searchElement = 3;
        boolean found = numbers.contains(searchElement);

        if (found) {
            System.out.println("Element " + searchElement + " found in the list.");
        } else {
            System.out.println("Element " + searchElement + " not found in the list.");
        }
    }
}

