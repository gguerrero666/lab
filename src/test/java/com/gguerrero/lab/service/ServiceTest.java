package com.gguerrero.lab.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ServiceTest {

    Service service;

    @Test
    public void service() {

        service = new Service();

        List<String> list = new ArrayList<>();

        list.add("Elemento 1");
        list.add("Elemento 2");
        list.add("Elemento 3");
        list.add("Elemento 4");
        list.add("Elemento 5");

        List<String> reversedList = service.getReversedList(list);

        assertEquals("Elemento 5", reversedList.get(0));
        assertEquals("Elemento 4", reversedList.get(1));
        assertEquals("Elemento 3", reversedList.get(2));
        assertEquals("Elemento 2", reversedList.get(3));
        assertEquals("Elemento 1", reversedList.get(4));

    }
}