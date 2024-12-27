package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddDoubleColumnNewColumnNameTest {

    @Test
    public void addDoubleColumnNewColumnNameTest() {
        DataFrame df = new DataFrame("testing");
        df.addDoubleColumn("column1");
        assertTrue(df.hasColumn("column1"));
    }

}