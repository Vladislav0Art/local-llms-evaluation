package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPublicMethod {

    @Test
    public void testPublicMethod() {
        DataFormat dataFormat = new DataFormat();
        assertEquals(2, dataFormat.length());
        assertEquals("string", dataFormat.type());
        assertEquals("int", dataFormat.indexType());
        assertEquals(true, dataFormat.isInt64());
        assertEquals(false, dataFormat.isDouble64());
    }

}