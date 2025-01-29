package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testFunction() {
        String result = Function.testFunction("test", 1, "1", "2");
        assertEquals(3, result);
    }

    @Test
    public void testFunctionWithParams() {
        String result = Function.testFunction("test", 1, "1", "2", 3);
        assertEquals(6, result);
    }

    @Test
    public void testFunctionWithTwoParam() {
        String result = Function.testFunction("test", 1, "1");
        assertEquals(2, result);
    }

}