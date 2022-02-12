package com.lynnfieldcoding.utils;

import java.util.SplittableRandom;

// some util methods to help with explaining, I know that some of them are redundant
// but it makes it simpler to learn
public class Utils {

    private static final SplittableRandom RANDOM = new SplittableRandom();

    public static int generateRandom(int min, int max) {
        return RANDOM.nextInt(min, max);
    }
}
