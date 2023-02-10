package com.gguerrero.lab.cron.controller;

import com.gguerrero.lab.cron.model.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping(value="example")
    public Example getExample() throws Exception{
        throw new Exception();

//        Example ex = new Example("1", "Titulo", "Esto es solo un ejemplo.");
//        return ex;

    }
}
