package com.pairing4good;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void whenFizzBuzzIsPassedNumberOneItReturnsNumberOne(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.fizz(1));
    }

    @Test
    public void whenFizzBuzzIsPassedNumberTwoItReturnsNumberTwo(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.fizz(2));
    }

    @Test
    public void whenFizzBuzzIsPassedNumberThreeReturnFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("fizz", fizzBuzz.fizz(3));
    }

    @Test
    public void whenFizzBuzzIsPassedNumberSixReturnFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("fizz", fizzBuzz.fizz(6));
    }

    @Test
    public void whenFizzBuzzIsPassedMultipleOfFiveReturnBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("buzz", fizzBuzz.fizz(5));
        assertEquals("buzz", fizzBuzz.fizz(10));
    }

    @Test
    public void whenFizzBuzzIsPassedMultipleOfThreeAndFiveReturnFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("fizzbuzz", fizzBuzz.fizz(15));
    }
}
