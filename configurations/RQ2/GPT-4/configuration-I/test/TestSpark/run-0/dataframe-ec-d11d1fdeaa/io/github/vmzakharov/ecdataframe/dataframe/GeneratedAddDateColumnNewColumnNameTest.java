package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddDateColumnNewColumnNameTest {

    @Test
    public void addDateColumnNewColumnNameTest() {
        DataFrame df = new DataFrame("testing");
        df.addDateColumn("column1");
        assertTrue(df.hasColumn("column1"));
    }

}