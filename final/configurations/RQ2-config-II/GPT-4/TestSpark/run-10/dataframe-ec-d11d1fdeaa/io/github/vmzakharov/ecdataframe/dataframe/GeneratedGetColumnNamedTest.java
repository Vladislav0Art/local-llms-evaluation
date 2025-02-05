package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetColumnNamedTest {

    @Test
    public void getColumnNamedTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("newCol");
        assertEquals("newCol", df.getColumnNamed("newCol").getName());
    }

}