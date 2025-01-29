package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPublicClass {

    @Test
    public void testPublicClass() {
        DataFormat dataFormat = new DataFormat();
        assertEquals("data_format", dataFormat.getClass().getSimpleName());
    }

}