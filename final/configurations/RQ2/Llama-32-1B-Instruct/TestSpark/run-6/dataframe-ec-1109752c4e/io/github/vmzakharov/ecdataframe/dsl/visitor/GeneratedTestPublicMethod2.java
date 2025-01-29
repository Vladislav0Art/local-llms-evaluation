package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPublicMethod2 {

    @Test
    public void testPublicMethod2() {
        DataFormat dataFormat = new DataFormat();
        assertEquals(3, dataFormat.length());
        assertEquals("string", dataFormat.type());
        assertEquals("int", dataFormat.indexType());
        assertEquals(true, dataFormat.isInt64());
        assertEquals(false, dataFormat.isDouble64());
    }

}