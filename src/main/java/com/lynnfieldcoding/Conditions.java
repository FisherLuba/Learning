package com.lynnfieldcoding;

/* IMPORTANT - this gives access to the variables in the Variables class
    You will almost never want to do this, because it makes the code much less readable
    I am doing this for now so you don't get confused.

    If this was not here, instead each variable would be used by doing Variable.<variableName>
    without the '<>'
 */
import static com.lynnfieldcoding.Variables.*;

// same as above, except for methods in Utils class
import static com.lynnfieldcoding.utils.Utils.*;


public class Conditions {

    public static void printConditions() {
        //------------If Statements------------

        // this will run if trueBoolean is true (which is always in this case)
        if (trueBoolean) {
            System.out.println("The value of trueBoolean is true!");
        }

        // nothing will be run if falseBoolean is false (which is always in this case)
        if (falseBoolean) {
            System.out.println("This message will not be printed");
        }

        // equalities in Java are done by using '==' between two values
        // Later you will learn about the equals() method
        // The reason you can put only a boolean value like truBoolean inside the () is
        // because things like negativeInteger == -100 becomes a boolean value
        // For example, boolean aBoolean = 500 == 1000; would be equal to false
        if (negativeInteger == -100) {
            System.out.println("This will be run because negativeInteger was assigned to -100");
        }

        if (7 == 2) {
            System.out.println("This will not be run, because 7 does not equal 2");
        }

        // to check for an inequality, you can do '!=' between two values
        if (5 != 3) {
            System.out.println("This will be run, because 5 does not equal 3");
        }

        //------------If-Else Statements------------
        if (false) {
            System.out.println("This will not be printed because the condition is false");
        } else {
            System.out.println("This will be printed, because the first condition was false");
        }

        if (true) {
            System.out.println("This will be printed because the condition is true");
        } else {
            System.out.println("This will not be printed because the first condition was true");
        }

        //------------If-Else-if Statements------------

        // you can chain as many of these together as you want,
        // but if there are a lot of conditions, using a switch (shown below)
        // should be used if possible
        if (false) {
            System.out.println("This code does not get run because the condition is false");
        } else if (false) {
            System.out.println("This code does not get run because the condition is false");
        } else {
            System.out.println("This code gets run because the first two conditions were false");
        }

        //------------Switch Statements------------

        // these are similar to if-else-if statements, but are used for multiple conditions
        // that have a boolean of the same data type, and checks for exact matches

        // method from the Utils class, you can ignore it for now
        int randomNumber = generateRandom(0, 100);
        switch (randomNumber) {
            // has three parts: the keyword 'case', the condition matching against,
            // then the '->', then the code to be run afterwards
            case 0 -> System.out.println("The value is 0");
            case 2 -> System.out.println("The value is 2");
            // you can chain multiple conditions together like so:
            case 3, 4, 5, 6 -> System.out.println("The number is between 3-6 (inclusive)");
            // if you need more than one statement to be run, you can use curly braces like so:
            case 7, 8 -> {
                System.out.println("--------Inside the {}--------");
                System.out.println("The random number is either 7 or 8");
                System.out.println("--------Last statement in {}--------");
            }
            // if you want code to run if no cases are true, you use the default keyword
            default -> {
                System.out.println("None of the conditions were true ):");
                System.out.println("The number was: " + randomNumber);
            }
        }

        // switch cases can also 'return' a value with the 'yield' keyword, but
        // I will explain more about that later after learning about methods

        //------------Boolean Operators------------

        // the boolean operators in Java are as follows:
        // == (equal)
        // != (not equal)
        // < (less than)
        // <= (less than or equal to
        // > (greater than)
        // >= (greater than or equal to)


        //------------Conditional Operators------------

        // You can also use multiple conditions in if statements with the 'or' operator and the 'and' operator
        // 'and' is represented by '&&' and 'or' is represented by '||'

        // the condition is false, because the && operator checks both conditions to see if they are true
        // if either of them are false, the whole expression is false
        if (true && false) {
            System.out.println("This will not be run (true && false)");
        }

        // the condition is true, because one side of the condition is true
        // in Java, if the left side is true and the condition uses 'or', then once
        // the left side is found to be true, the right side is not even checked
        // you can keep this in mind for later, if for example the two booleans are returned from two different
        // methods that may take different amounts of time, put the shorter one on the left side
        if (true || false) {
            System.out.println("This code will be run (true || false)");
        }

    }


}
