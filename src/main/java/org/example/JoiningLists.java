package org.example;

import java.util.ArrayList;
import java.util.List;

public class JoiningLists {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(12);
        list1.add(13);

        List<Integer> list2 = new ArrayList<>();
        list2.add(14);
        list2.add(15);
        list2.add(16);


        List<Integer> joinedList = new ArrayList<>();
        joinedList.addAll(list1);
        joinedList.addAll(list2);

        System.out.println("Joined List: " + joinedList);
    }
}
