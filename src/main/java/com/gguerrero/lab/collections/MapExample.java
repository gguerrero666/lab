package com.gguerrero.lab.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "primer valor");
        map.put(2, "Segundo valor");
        map.put(3, "tercer valor");



//        MAP Overrides duplicates by key
//        map.put(1, "primer valor");

//        MAP Allows duplicates with different key
        map.put(4, "primer valor");

        // old way
        for (String s: map.values()) {
            System.out.println(s);
        }

        System.out.println();

        // lambda
        map.forEach((integer, s) -> System.out.println(s));

    }
}
