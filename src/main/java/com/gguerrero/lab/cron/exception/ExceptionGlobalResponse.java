package com.gguerrero.lab.cron.exception;

import com.gguerrero.lab.cron.model.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionGlobalResponse {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Example> runtimeException(RuntimeException e){
        Example ex = new Example("500", "Error", "[Exception Response] - Exception: " + e.getMessage());
        return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Example> exception(Exception e){
        Example ex = new Example("500", "Error", "[Exception Response] - Exception: " + e.getMessage());
        return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
