package com.pairing4good;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void whenFizzBuzzIsPassedNumberOneItReturnsNumberOne(){
        FizzBuzz johnSagar = new FizzBuzz();
        assertEquals("1", johnSagar.fizz(1));
    }

    @Test
    public void whenFizzBuzzIsPassedNumberTwoItReturnsNumberTwo(){
        FizzBuzz johnSagar = new FizzBuzz();
        assertEquals("2", johnSagar.fizz(2));
    }

    @Test
    public void whenFizzBuzzIsPassedNumberThreeReturnFizz(){
        FizzBuzz johnSagar = new FizzBuzz();
        assertEquals("fizz", johnSagar.fizz(3));
    }

    @Test
    public void whenFizzBuzzIsPassedNumberSixReturnFizz(){
        FizzBuzz johnSagar = new FizzBuzz();
        assertEquals("fizz", johnSagar.fizz(6));
    }
    @Test
    public void whenFizzBuzzIsPassedNumberFiveReturnBuzz(){
        FizzBuzz johnSagar = new FizzBuzz();
        assertEquals("buzz", johnSagar.fizz(5));
        assertEquals("buzz", johnSagar.fizz(10));
    }
}
