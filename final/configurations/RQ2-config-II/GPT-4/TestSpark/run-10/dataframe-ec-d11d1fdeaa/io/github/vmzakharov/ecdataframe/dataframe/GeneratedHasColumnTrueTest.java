package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasColumnTrueTest {

    @Test
    public void hasColumnTrueTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("newCol");
        assertTrue(df.hasColumn("newCol"));
    }

}