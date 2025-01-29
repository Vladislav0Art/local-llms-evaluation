package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestFunctionWithTwoParam {

    @Test
    public void testFunctionWithTwoParam() {
        String result = Function.testFunction("test", 1, "1");
        assertEquals(2, result);
    }

}