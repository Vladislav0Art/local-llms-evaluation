package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDataFrameNewNameTest {

    @Test
    public void DataFrameNewNameTest() {
        DataFrame df = new DataFrame("testing");
        assertEquals("testing", df.getName());
    }

}