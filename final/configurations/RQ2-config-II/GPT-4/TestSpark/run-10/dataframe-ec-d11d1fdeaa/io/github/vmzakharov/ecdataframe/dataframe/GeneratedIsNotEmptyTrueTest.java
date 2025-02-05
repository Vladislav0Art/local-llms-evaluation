package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsNotEmptyTrueTest {

    @Test
    public void isNotEmptyTrueTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("newCol");
        assertTrue(df.isNotEmpty());
    }

}