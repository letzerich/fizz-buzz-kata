package com.pairing4good;

public class FizzBuzz {

    public String fizz(Integer value) {
        if(value % 3 == 0){
            return "fizz";
        }else{
            return value.toString();
        }
    }
}
