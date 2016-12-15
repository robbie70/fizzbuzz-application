package com.equalexperts.fb;

public class FizzBuzzReport {

    private int fizzCount = 0;
    private int buzzCount = 0;
    private int fizzbuzzCount = 0;
    private int luckyCount = 0;
    private int integerCount = 0;

    public int incrementCounterFor(String value){
        if("fizz".equals(value)) return ++fizzCount;
        if("buzz".equals(value)) return ++buzzCount;
        if("fizzbuzz".equals(value)) return ++fizzbuzzCount;
        if("lucky".equals(value)) return ++luckyCount;
        return ++integerCount;
    }

    @Override
    public String toString(){
        return String.format("fizz: %s buzz: %s fizzbuzz: %s lucky: %s integer: %s", fizzCount, buzzCount, fizzbuzzCount, luckyCount, integerCount);
    }
}
