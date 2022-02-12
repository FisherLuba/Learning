package com.lynnfieldcoding;

/*
* This is a class, you can ignore it for now
*
* You can also ignore 'public static final', you will learn what each of those mean later
* For now, all you need to know is that making it public and static means you can
* access it from another class
*
* final means you can not assign another value to the variable
 * */
public class Variables {

    // boolean data types
    public static final boolean trueBoolean = true;
    public static final boolean falseBoolean = false;

    // integer data types
    public static final int positiveInteger = 100;
    public static final int negativeInteger = -100;

    // char data types
    public static final char aChar = 'a';
    public static final char unicodeChar = '\u263A';

    // string data types
    public static final String string = "String";
    public static final String sentenceString = "A sentence using the String data types in Java.";

    // this is a method, you can ignore this until you learn about it
    public static void printVariables() {

        // ------------Printing Data Types------------
        System.out.println("trueBoolean = " + trueBoolean);
        System.out.println("falseBoolean = " + falseBoolean);

        System.out.println("positiveInteger = " + positiveInteger);
        System.out.println("negativeInteger = " + negativeInteger);

        System.out.println("aChar = " + aChar);
        System.out.println("unicodeChar = " + unicodeChar);

        System.out.println("string = " + string);
        System.out.println("sentenceString = " + sentenceString);

        // ------------Adding Integers------------
        System.out.println("positiveInteger + negativeInteger = " + (positiveInteger + negativeInteger)); // result is 0

        // ------------Concatenating Strings------------
        System.out.println("string + sentenceString = " + string + sentenceString);
    }


}
