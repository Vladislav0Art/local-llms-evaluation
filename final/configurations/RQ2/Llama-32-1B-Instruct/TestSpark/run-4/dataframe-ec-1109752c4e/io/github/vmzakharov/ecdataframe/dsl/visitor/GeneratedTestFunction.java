package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestFunction {

    @Test
    public void testFunction() {
        String result = Function.testFunction("test", 1, "1", "2");
        assertEquals(3, result);
    }

}