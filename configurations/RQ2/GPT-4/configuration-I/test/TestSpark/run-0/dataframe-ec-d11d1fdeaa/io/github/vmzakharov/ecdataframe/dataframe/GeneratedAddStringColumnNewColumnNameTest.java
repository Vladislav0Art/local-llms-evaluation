package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddStringColumnNewColumnNameTest {

    @Test
    public void addStringColumnNewColumnNameTest() {
        DataFrame df = new DataFrame("testing");
        df.addStringColumn("column1");
        assertTrue(df.hasColumn("column1"));
    }

}