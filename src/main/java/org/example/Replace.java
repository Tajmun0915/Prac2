package org.example;

import java.util.Arrays;
import java.util.List;

public class Replace {
    public static void main(String[] args) {
        Integer[] array = {1,0,1,0,1,0,1,1,1,0,1,0,1,0};
        List<Integer> list = Arrays.asList(array);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.set(i, 1);
            }
        }

        System.out.println("After Replacement Modified List :" + list);
    }
}
