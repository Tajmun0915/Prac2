package org.example;

import java.util.ArrayList;
import java.util.List;

public class SubList {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);

        List<Integer> subList = numbers.subList(1, 5);
        System.out.println("Sublist : " + subList);

        /*
        Remove the 3rd element from the list
         */
        if(numbers.size()>2) {
            numbers.remove(2);
        }else {
            System.out.println("Element not found");;
        }
        System.out.println(numbers);
    }
}