package com.gguerrero.lab.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Primer valor");
        list.add("Segundo valor");
        list.add("Tercer valor");
        list.add("Cuarto valor");

        // List allows duplicated values
//        list.add("Primer valor");

        // old way
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println();


        // lambda
        list.forEach(System.out::println);


    }
}
