package com.gguerrero.lab.collections;

import java.util.HashSet;

public class SetExample {

    public static void main(String[] args){
        java.util.Set<String> set = new HashSet<>();

        set.add("set 1");
        set.add("set 2");
        set.add("set 3");
        set.add("set 4");

        // old way
        for (String s : set) {
            System.out.println(s);
        }

        // lambda
        set.forEach(System.out::println);

    }

}
