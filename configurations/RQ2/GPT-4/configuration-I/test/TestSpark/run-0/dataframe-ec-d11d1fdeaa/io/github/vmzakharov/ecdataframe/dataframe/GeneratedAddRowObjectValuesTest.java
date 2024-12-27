package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddRowObjectValuesTest {

    @Test
    public void addRowObjectValuesTest() {
        DataFrame df = new DataFrame("testing");
        df.addStringColumn("column1");
        df.addRow("value1");
        assertEquals("value1", df.getString("column1", 0));
    }

}