package com.lynnfieldcoding;

public class AccessModifiers {

    /*
    Access modifiers may be trickier to understand than the previous concepts.
    These are used to define where code is allowed to be called / run

    Access modifiers can apply to variables, methods, and constructors (you will learn about constructors
     when we get to classes)

    The list of access modifiers are:

    - public
    - private
    - protected
    - default (do not put anything)

    public, as you could probably guess, means that the code can be called / used from any other class

    private means that only the class the method / variable is defined in can use it

    protected is the same as private, except any classes in the same package or subclasses can also access it
    (We will get to packages later)

    default is package-private, which is the same as protected except subclasses cannot access the variables / methods
    if they are in other packages
     */


    // this method can be called in another class by doing
    // AccessModifiers.publicMethod()
    public static void publicMethod() {

    }

    // calling this method in another class would cause a compile error
    // because the other class cannot 'see' this method
    private static void privateMethod() {

    }

    // this method can be called in any class in the same package / a subclass
    // by doing AccessModifiers.protectedMethod()
    protected static void protectedMethod() {

    }

    // this method can be called in any class in the same package
    // by doing AccessModifiers.default()
    static void defaultMethod() {

    }
}
