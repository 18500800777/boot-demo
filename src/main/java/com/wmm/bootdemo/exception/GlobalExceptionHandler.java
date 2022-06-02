package com.wmm.bootdemo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * author : wmm
 * date : 2022-05-27 15:17
 * description :
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    public String handlerArithmeticException(Exception e){
        return "login";
    }
}
