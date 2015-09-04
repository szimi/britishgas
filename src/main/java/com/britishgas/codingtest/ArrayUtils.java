package com.britishgas.codingtest;

/**
 * Created by gyorgy.szimeonov on 04/09/2015.
 */
public class ArrayUtils {

    public static final int INDEX_NOT_FOUND = -1;

    public Integer indexOf(Integer[] target, Integer[] value) {

        if (target == null || value == null) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < target.length; i++) {
            for (int x = 0; x < value.length && i < target.length; x++) {
                if (target[i] == value[x]) {
                    if (x + 1 == value.length) {
                        return i - x;
                    }
                    i++;

                } else {
                    break;
                }
            }
        }

        return INDEX_NOT_FOUND;
    }
}
