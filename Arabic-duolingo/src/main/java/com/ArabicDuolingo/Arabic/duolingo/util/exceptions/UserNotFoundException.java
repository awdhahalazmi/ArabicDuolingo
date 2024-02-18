package com.ArabicDuolingo.Arabic.duolingo.util.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String str){
        super(str);
    }
}
