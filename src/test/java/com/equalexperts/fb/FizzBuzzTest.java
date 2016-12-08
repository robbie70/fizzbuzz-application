package com.equalexperts.fb;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * Created by robbie on 06/12/2016.
 */
public class FizzBuzzTest {

    @Test
    public void one_should_print_as_integer_test() {
        FizzBuzz fb = new FizzBuzz();
        String output = fb.calcNextValue(1);
        assertTrue(output.equals("1"));
    }

    @Test
    public void five_should_print_as_buzz_test() {
        FizzBuzz fb = new FizzBuzz();
        String output = fb.calcNextValue(5);
        assertTrue(output.equals("buzz"));
    }

    @Test
    public void three_should_print_as_fizz_test() {
        FizzBuzz fb = new FizzBuzz();
        String output = fb.calcNextValue(3);
        assertTrue(output.equals("lucky"));
    }

    @Test
    public void fifteen_should_print_as_fizzbuzz_test() {
        FizzBuzz fb = new FizzBuzz();
        String output = fb.calcNextValue(15);
        assertTrue(output.equals("fizzbuzz"));
    }

    @Test
    public void minus_one_should_print_as_integer_test() {
        FizzBuzz fb = new FizzBuzz();
        String output = fb.calcNextValue(-1);
        assertTrue(output.equals("-1"));
    }

    @Test
    public void two_integers_should_print_as_ints_Test() {
        FizzBuzz fb = new FizzBuzz();
        StringBuilder sb = fb.prepareOutput(1, 2);
        assertTrue(sb.toString().equals("1 2"));
    }

    @Test
    public void three_should_print_as_lucky_Test() {
        FizzBuzz fb = new FizzBuzz();
        String output = fb.calcNextValue(3);
        assertTrue(output.equals("lucky"));
    }

    @Test
    public void thirteen_should_print_as_lucky_Test() {
        FizzBuzz fb = new FizzBuzz();
        String output = fb.calcNextValue(13);
        assertTrue(output.equals("lucky"));
    }

    @Test
    public void minus_hundredandthirtytwo_should_print_as_lucky_Test() {
        FizzBuzz fb = new FizzBuzz();
        String output = fb.calcNextValue(-132);
        assertTrue(output.equals("lucky"));
    }

    @Test
    //Step Two final test
    public void should_print_one_to_twenty_Test() {
        FizzBuzz fb = new FizzBuzz();
        StringBuilder sb = fb.prepareOutput(1, 20);
        assertTrue(sb.toString().equals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"));
    }

    @Test
    public void calculate_report_totals_Test() {
        FizzBuzz fb = new FizzBuzz();
        Map<String, Integer> reportTotals = fb.calcReportTotals("buzz 1 buzz 2 lucky lucky buzz fizzbuzz fizzbuzz fizz");
        assertTrue(reportTotals.get("fizzCounter") == 1);
        assertTrue(reportTotals.get("buzzCounter") == 3);
        assertTrue(reportTotals.get("fizzbuzzCounter") == 2);
        assertTrue(reportTotals.get("luckyCounter") == 2);
        assertTrue(reportTotals.get("integerCounter") == 2);
    }

    @Test
    public void should_prepare_report_Test() {
        FizzBuzz fb = new FizzBuzz();
        Map<String, Integer> reportTotals = new HashMap<>();
        reportTotals.put("fizzCounter", 1);
        reportTotals.put("buzzCounter", 2);
        reportTotals.put("fizzbuzzCounter", 3);
        reportTotals.put("luckyCounter", 4);
        reportTotals.put("integerCounter", 5);
        StringBuilder reportTotalsOutput = fb.prepareReport(reportTotals);
        assertTrue(reportTotalsOutput.toString().equals("fizz: " + reportTotals.get("fizzCounter") + " buzz: " + reportTotals.get("buzzCounter")
                + " fizzbuzz: " + reportTotals.get("fizzbuzzCounter") + " lucky: " + reportTotals.get("luckyCounter") + " integer: " + reportTotals.get("integerCounter")));
    }

    @Test
    //Step Three final test
    public void should_print_one_to_twenty_with_report_Test() {
        FizzBuzz fb = new FizzBuzz();
        StringBuilder sb = fb.outputProducer(1, 20);
        assertTrue(sb.toString().equals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10"));
    }
}
