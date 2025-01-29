package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestFunctionWithParams {

    @Test
    public void testFunctionWithParams() {
        String result = Function.testFunction("test", 1, "1", "2", 3);
        assertEquals(6, result);
    }

}