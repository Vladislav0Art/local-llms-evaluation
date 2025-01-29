package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

public class GeneratedTest {

    public String testMethod1() {
        return "Hello, World!";
    }

    @Test
    public void testMethod1() {
        String result = String.format("Hello, World!");
        assertEquals(result, "Hello, World!");
    }

    @Test
    public void testMethod2() {
        int[] array = {1, 2, 3};
        int sum = addArray(array);
        assertEquals(6, sum);
    }

    private int addArray(int[] array) {
        return array[0] + array[1];
    }

    @Test
    public void testMethod3() {
        String result = String.format("Hello, World!");
        assertEquals(result, "Hello, World!");
    }

}