package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsNotEmptyTest {

    @Test
    public void isNotEmptyTest() {
        DataFrame df = new DataFrame("testing");
        df.addStringColumn("column1");
        df.addRow("value1");
        assertTrue(df.isNotEmpty());
    }

}