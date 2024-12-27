package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedColumnCountTest {

    @Test
    public void columnCountTest() {
        DataFrame df = new DataFrame("testing");
        df.addStringColumn("column1");
        df.addStringColumn("column2");
        assertEquals(2, df.columnCount());
    }

}