package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPublicMethod1 {

    @Test
    public void testPublicMethod1() {
        DataFormat dataFormat = new DataFormat();
        assertEquals(4, dataFormat.length());
        assertEquals("string", dataFormat.type());
        assertEquals("double", dataFormat.indexType());
        assertEquals(true, dataFormat.isInt64());
        assertEquals(false, dataFormat.isDouble64());
    }

}