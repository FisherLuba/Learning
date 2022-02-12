package com.lynnfieldcoding;

import java.time.chrono.MinguoDate;

public class Loops {

    // Loops are one of the most important things in programming
    // they allow you to repeat code multiple times, without having to write it out
    // every single time you want the code to be run
    // there are different ways that loops can be written in Java

    // for loop
    public static void simpleForLoop() {
        // for loops are made up of 3 statements:
        // 1. first statement is run once
        // 2. condition that must be true for the loop to run
        // 3. statement that runs after every loop

        // this loop declares the variable i, and sets its value to 0
        // after every successful loop of code (everything inside the brackets),
        // the boolean is checked. If it is true, the loop runs again
        // if it is false, the code inside the loop is not run, and the program moves to the next line
        // the third statement is run before the condition is checked

        // i++ means add 1 to the variable i
        // i += 1 means the same thing, but you can also do things like
        // i += 50, i -= 5, i *= 40, i /= 5;
        System.out.println("Executing the for loop");
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside the for loop, i = " + i);
        }
    }

    // there is also a loop called the enhanced for loop,
    // which loops over a collection
    public static void enhancedForLoop() {
        // this is called an array, it holds a fixed number of values of a certain type
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i : numbers) {
            System.out.println("Inside the enhanced for loop, i = " + i);
        }

        // you can access an array by its indices, for example
        // looping over an array and setting its values
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Current array value at index " + i + " is " + numbers[i]);
            numbers[i] = numbers[i] + 1;
            System.out.println("new array value at index " + i + " is " + numbers[i]);
        }
    }

    // the while loop runs code while a condition is true
    public static void whileLoop() {
        int i = 0;
        while (i < 5) {
            System.out.println("In the while loop, i = " + i);
            i++;
        }

        // be careful not to have an infinite loop, because no other code will be run:
        i = 0;
        while (i >= 0) {
            System.out.println("This code will run infinitely");
            i++;

            // this is a good time to talk about exiting loops earl
            // this can be done with the 'break' keyword, and the 'return' keyword
            // 'break' immediately exits a for loop
            // return does the same thing, except with the whole method

            if (i == 7) {
                System.out.println("The loop has been broken!");
                break;
            }
            // no need for an if-else here, because this code will not be run if
            // 'break' is executed

            System.out.println("The loop was not broken!");
        }

        // you can also go back to the start of a loop without executing
        // the rest of the code in the loop with the keyword 'continue'

        // using 'j' because 'i' is already declared
        for (int j = 0; j < 10; j++) {
            if (j <= 5) {
                continue;
            }

            // no need for an if-else here, 'continue' goes right back to the top
            System.out.println("Past the 'continue', i = " + i);
        }
    }

    public static void testLoops() {
        simpleForLoop();
        enhancedForLoop();
        whileLoop();
    }

}
