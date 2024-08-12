package com.EaseBus.exceptions;

import jakarta.servlet.annotation.WebFilter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BusNotFoundException.class)
    public ResponseEntity<?> busNotFoundExceptionHandler(BusNotFoundException e, WebRequest webRequest){
        return new ResponseEntity<>(e.getMessage()+webRequest.getDescription(true), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(RouteNotFoundException.class)
    public ResponseEntity<?> routeNotFoundHandler(RouteNotFoundException e,WebRequest webRequest){
        return new ResponseEntity<>(e.getMessage()+webRequest.getDescription(true),HttpStatus.NOT_FOUND);
    }

}
