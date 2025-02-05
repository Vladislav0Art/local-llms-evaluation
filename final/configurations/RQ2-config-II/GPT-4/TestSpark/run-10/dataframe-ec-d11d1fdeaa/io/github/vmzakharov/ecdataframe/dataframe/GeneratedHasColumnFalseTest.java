package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasColumnFalseTest {

    @Test
    public void hasColumnFalseTest() {
        DataFrame df = new DataFrame("Test");
        assertFalse(df.hasColumn("newCol"));
    }

}