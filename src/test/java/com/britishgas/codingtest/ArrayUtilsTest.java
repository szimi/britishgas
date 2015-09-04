package com.britishgas.codingtest;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by gyorgy.szimeonov on 04/09/2015.
 */
public class ArrayUtilsTest {

    private ArrayUtils arrayUtils;

    @Before
    public void setUp() throws Exception {
        arrayUtils = new ArrayUtils();
    }

    @Test
    public void shouldReturnIndex() {
        //given
        Integer[] target = {2, 3, 4, 5, 1, 32, 4};

        //and
        Integer[] value = {4, 5, 1};

        //when
        Integer result = arrayUtils.indexOf(target, value);

        //then
        Integer expectedResult = 2;

        assertThat(result, is(expectedResult));

    }

    @Test
    public void shouldReturnIndexNotFound() {
        //given
        Integer[] target = {2, 3, 4, 5, 1, 32, 4};

        //and
        Integer[] value = {4, 5, 2};

        //when
        Integer result = arrayUtils.indexOf(target, value);

        //then
        Integer expectedResult = -1;

        assertThat(result, is(expectedResult));
    }

    @Test
    public void shouldReturnIndexNotFoundIfValueIsEmpty() {
        //given
        Integer[] target = {2, 3, 4, 5, 1, 32, 4};

        //and
        Integer[] value = {};

        //when
        Integer result = arrayUtils.indexOf(target, value);

        //then
        Integer expectedResult = -1;

        assertThat(result, is(expectedResult));
    }

    @Test
    public void shouldReturnIndexNotFoundtIfTargetIsEmpty() {
        //given
        Integer[] target = {};

        //and
        Integer[] value = {};

        //when
        Integer result = arrayUtils.indexOf(target, value);

        //then
        Integer expectedResult = -1;

        assertThat(result, is(expectedResult));
    }

    @Test
    public void shouldReturnZeroIfArraysAreIdentical() {
        Integer[] target = { 123 };

        //and
        Integer[] value = { 123 };

        //when
        Integer result = arrayUtils.indexOf(target, value);

        //then
        Integer expectedResult = 0;

        assertThat(result, is(expectedResult));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfTargetIsNull() {
        arrayUtils.indexOf(null, new Integer[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfValueIsNull() {
        arrayUtils.indexOf(new Integer[]{}, null);
    }
}
