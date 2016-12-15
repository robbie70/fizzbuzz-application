package com.equalexperts.fb;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void one_should_print_as_integer_test(){
        FizzBuzz fb = new FizzBuzz();
        String output = fb.processDigit(1);
        assertEquals("1", output);
    }

    @Test
    public void five_should_print_as_buzz_test(){
        FizzBuzz fb = new FizzBuzz();
        String output = fb.processDigit(5);
        assertEquals("buzz", output);
    }

    @Test
    public void three_should_print_as_fizz_test(){
        FizzBuzz fb = new FizzBuzz();
        String output = fb.processDigit(3);
        assertEquals("lucky", output);
    }

    @Test
    public void fifteen_should_print_as_fizzbuzz_test(){
        FizzBuzz fb = new FizzBuzz();
        String output = fb.processDigit(15);
        assertEquals("fizzbuzz", output);
    }

    @Test
    public void minus_one_should_print_as_integer_test(){
        FizzBuzz fb = new FizzBuzz();
        String output = fb.processDigit(-1);
        assertEquals("-1", output);
    }

    @Test
    public void two_integers_should_print_as_ints_test(){
        FizzBuzz fb = new FizzBuzz();
        String sb = fb.prepareOutput(1, 2);
        assertEquals("1 2", sb);
    }

    @Test
    public void three_should_print_as_lucky_test(){
        FizzBuzz fb = new FizzBuzz();
        String output = fb.processDigit(3);
        assertEquals("lucky", output);
    }

    @Test
    public void thirteen_should_print_as_lucky_test(){
        FizzBuzz fb = new FizzBuzz();
        String output = fb.processDigit(13);
        assertEquals("lucky", output);
    }

    @Test
    public void minus_hundredandthirtytwo_should_print_as_lucky_test(){
        FizzBuzz fb = new FizzBuzz();
        String output = fb.processDigit(-132);
        assertEquals("lucky", output);
    }

    @Test
    //Step Two final test
    public void should_print_one_to_twenty_test(){
        FizzBuzz fb = new FizzBuzz();
        String output = fb.prepareOutput(1, 20);
        assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz", output);
    }

    @Test
    //Step Three final test
    public void should_print_one_to_twenty_with_report_test(){
        FizzBuzz fb = new FizzBuzz();
        String output = fb.outputProducer(1, 20);
        assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10", output);
    }
}
