package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testSetGetSuccess() {
        System.out.println("setGetSuccess");
        int[] successes = setSuccess(10, 5);
        if (successes.length == 0) {
            throw new RuntimeException();
        }
        for (int i : successes) {
            System.out.println(i);
        }
    }

    @Test
    public void testSetGetSuccess() {
        System.out.println("setGetSuccess");
        int[] successes = setSuccess(10, 5);
        if (successes.length == 0) {
            throw new RuntimeException();
        }
        for (int i : successes) {
            System.out.println(i);
        }
    }

    private int[] getSuccess() {
        return new int[]{1, 2, 3};
    }

    @Test
    public void testSetGetSuccess() {
        System.out.println("setGetSuccess");
        int[] successes = setSuccess(10, 5);
        if (successes.length == 0) {
            throw new RuntimeException();
        }
        for (int i : successes) {
            System.out.println(i);
        }
    }

    private int[] setSuccess(int base, int factor) {
        return new int[]{base + factor};
    }

}