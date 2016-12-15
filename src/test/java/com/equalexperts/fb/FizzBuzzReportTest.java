package com.equalexperts.fb;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzReportTest {

    @Test
    public void calculate_report_totals_test(){
        FizzBuzzReport fbr = new FizzBuzzReport();
        int fizzCount = fbr.incrementCounterFor("fizz");
        fizzCount = fbr.incrementCounterFor("fizz");
        int buzzCount = fbr.incrementCounterFor("buzz");
        int fizzbuzzCount = fbr.incrementCounterFor("fizzbuzz");
        int luckyCount = fbr.incrementCounterFor("lucky");
        int integerCount = fbr.incrementCounterFor("integerCount");
        integerCount = fbr.incrementCounterFor("integerCount");

        assertEquals(Integer.valueOf(2), (Integer) fizzCount);
        assertEquals(Integer.valueOf(1), (Integer) buzzCount);
        assertEquals(Integer.valueOf(1), (Integer) fizzbuzzCount);
        assertEquals(Integer.valueOf(1), (Integer) luckyCount);
        assertEquals(Integer.valueOf(2), (Integer) integerCount);
    }

    @Test
    public void should_prepare_report_test(){
        FizzBuzzReport fbr = new FizzBuzzReport();

        int fizzCount = fbr.incrementCounterFor("fizz");
        fizzCount = fbr.incrementCounterFor("fizz");
        int buzzCount = fbr.incrementCounterFor("buzz");
        int fizzbuzzCount = fbr.incrementCounterFor("fizzbuzz");
        int luckyCount = fbr.incrementCounterFor("lucky");
        int integerCount = fbr.incrementCounterFor("integerCount");
        integerCount = fbr.incrementCounterFor("integerCount");
        assertEquals("fizz: " + fizzCount + " buzz: " + buzzCount + " fizzbuzz: " + fizzbuzzCount + " lucky: "
                + luckyCount + " integer: " + integerCount, fbr.toString());
    }

}
