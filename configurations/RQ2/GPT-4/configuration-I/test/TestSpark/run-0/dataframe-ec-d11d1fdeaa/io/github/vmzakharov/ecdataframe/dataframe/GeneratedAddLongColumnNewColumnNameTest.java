package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddLongColumnNewColumnNameTest {

    @Test
    public void addLongColumnNewColumnNameTest() {
        DataFrame df = new DataFrame("testing");
        df.addLongColumn("column1");
        assertTrue(df.hasColumn("column1"));
    }

}