package com.lynnfieldcoding;

import static com.lynnfieldcoding.utils.Utils.*;

public class Methods {

    // a method is a set of code that can be called repeatedly
    // A method can accept 0 or more parameters (explained below),
    // and 'return' a value or no value

    // you can ignore 'static' for now, it will be explained once you learn about classes

    // 'void' means nothing is returned from the method
    // the empty () means there are no parameters
    // this method will print a random number from -2^31 to 2^31 - 1
    static void printRandomNumber() {
        System.out.println(generateRandom(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    // this method has one parameter, 'message'
    // This means when you call the method, you must pass a String value
    // A parameter is the same as what is put on the left side of a variable declaration:
    // type and name
    // this method will print any message passed as the parameter
    static void printAMessage(String message) {
        System.out.println("Printing the message: " + message);
    }

    static void printMultipleMessages(String message1, String message2, String message3) {
        // you can also call methods inside of another method

        // in order to call a method, you write the method name, followed by parenthesis
        // if the method has parameters, you must pass in the values inside the parenthesis
        // if it does not have parameters, you leave the parenthesis blank, for example:
        // someMethod();

        // this calls the printAMessage method, and passes in the first message as a parameter
        printAMessage(message1);
        // this calls the printAMessage method, and passes in the second message as a parameter
        printAMessage(message2);
        // this calls the printAMessage method, and passes in the third message as a parameter
        printAMessage(message3);
    }

    // this method must return a String value
    static String addTwoStrings(String first, String second) {
        // concatenating the string into one variable
        String combined = first + second;
        // the 'return' keyword means the variable 'combined' is returned
        return combined;
        // you could also do "return first + second" as one line instead

        // no other code will be run after the return statement, because the method is exited
        // if the below code was not commented, the program would not compile because the code would never run

//        System.out.println("This will not work");
    }

    // this will test all the methods to show they work
    public static void testMethods() {
        System.out.println("----------Printing a random number----------");
        printRandomNumber();

        System.out.println("----------Printing a message----------");
        printAMessage("This is a really good message");

        System.out.println("----------Printing multiple messages----------");
        printMultipleMessages("Wow! Message #1.", "Amazing! Message #2", "Extraordinary! Message #3");

        System.out.println("----------Adding two strings");
        String resultOfAdding = addTwoStrings("Hello ", "World"); // value is "Hello World"
        System.out.println("resultOfAdding = " + resultOfAdding);
    }
}
