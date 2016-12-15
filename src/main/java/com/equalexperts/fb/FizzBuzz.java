package com.equalexperts.fb;

public class FizzBuzz {

    private static final int THREE = 3;
    private static final int FIVE = 5;
    private FizzBuzzReport fizzBuzzReport = new FizzBuzzReport();

    public String outputProducer(int startInt, int endInt){
        return prepareOutput(startInt, endInt) + " " + fizzBuzzReport.toString();
    }

    public String prepareOutput(int startInt, int endInt){
        StringBuilder resultString = new StringBuilder();
        String output;
        for (int i = startInt; i <= endInt; i++){
            if (i != startInt) {
                resultString.append(" ");
            }
            output = processDigit(i);
            resultString.append(output);
            fizzBuzzReport.incrementCounterFor(output);
        }
        return resultString.toString();
    }

    public String processDigit(int i) {

        if(String.valueOf(i).contains(String.valueOf(THREE))){
            return "lucky";
        }else if (i % ( FIVE * THREE) == 0){
            return "fizzbuzz";
        }else if (i % THREE == 0){
            return "fizz";
        }else if (i % FIVE == 0){
            return "buzz";
        }
        return Integer.toString(i);
    }

}