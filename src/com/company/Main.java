package com.company;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
	    System.out.println("Float minimum value =  " + myMinFloatValue);
	    System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value =  " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5/3; // goes in one so not exact value
        float myFloatValue = (float) 5f/3f; // how to cast the variable
        double myDoubleValue = 5.00/3.00; // more precise than the float and assumes that it is adouble
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = "+ myFloatValue);
        System.out.println("MyDoubleValue = "+ myDoubleValue);

        double pound = 200d;
        double kilogram = 0.45359237d; // don't have to put d but can for consistency
        double convert = (pound*kilogram);
        System.out.println(convert);

        double pi = 3.14d;
        double anotherNumber = 3_000_000.4;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
