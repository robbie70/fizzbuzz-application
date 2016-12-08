package com.equalexperts.fb;

import java.util.*;

/**
 * Created on 06/12/2016.
 */
public class FizzBuzz {

    private static final int THREE = 3;
    private static final int FIVE = 5;

    public StringBuilder outputProducer(int startInt, int endInt) {
        StringBuilder output = prepareOutput(startInt, endInt);
        StringBuilder reportTotals = reportProducer(output.toString());
        output.append(" ");
        output.append(reportTotals);
        return output;
    }

    public StringBuilder reportProducer(String outputString) {
        Map<String, Integer> reportTotals = calcReportTotals(outputString);
        return prepareReport(reportTotals);
    }

    public Map<String, Integer> calcReportTotals(String outputString) {
        List<String> sentence = Arrays.asList(outputString.split(" "));
        Map<String, Integer> reportTotals = new HashMap<>();
        int fizzCounter = 0;
        int buzzCounter = 0;
        int fizzBuzzCounter = 0;
        int luckyCounter = 0;
        int integerCounter = 0;

        for (int i = 0; i < sentence.size(); i++) {
            switch (sentence.get(i)) {
                case "fizz":
                    fizzCounter++;
                    break;
                case "buzz":
                    buzzCounter++;
                    break;
                case "fizzbuzz":
                    fizzBuzzCounter++;
                    break;
                case "lucky":
                    luckyCounter++;
                    break;
                default:
                    integerCounter++;
                    break;
            }
        }
        reportTotals.put("fizzCounter", fizzCounter);
        reportTotals.put("buzzCounter", buzzCounter);
        reportTotals.put("fizzbuzzCounter", fizzBuzzCounter);
        reportTotals.put("luckyCounter", luckyCounter);
        reportTotals.put("integerCounter", integerCounter);
        return reportTotals;
    }

    public StringBuilder prepareReport(Map<String, Integer> reportTotals) {
        return new StringBuilder("fizz: " + reportTotals.get("fizzCounter") + " buzz: " + reportTotals.get("buzzCounter")
                + " fizzbuzz: " + reportTotals.get("fizzbuzzCounter") + " lucky: " + reportTotals.get("luckyCounter") + " integer: " + reportTotals.get("integerCounter"));
    }

    public StringBuilder prepareOutput(int startInt, int endInt) {
        StringBuilder resultString = new StringBuilder();
        for (int i = startInt; i <= endInt; i++) {
            if (i != startInt) {
                resultString.append(" ");
            }
            resultString.append(calcNextValue(i));
        }
        return resultString;
    }

    public String calcNextValue(int i) {
        String resultString = Integer.toString(i);
        if (String.valueOf(i).contains(String.valueOf(THREE))) {
            resultString = "lucky";
        } else if (i % (FIVE * THREE) == 0) {
            resultString = "fizzbuzz";
        } else if (i % THREE == 0) {
            resultString = "fizz";
        } else if (i % FIVE == 0) {
            resultString = "buzz";
        }
        return resultString;
    }

}