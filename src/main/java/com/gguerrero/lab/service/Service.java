package com.gguerrero.lab.service;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    public List<String> getReversedList(List<String> list){
        return list.reversed().stream().toList();
    }
}
