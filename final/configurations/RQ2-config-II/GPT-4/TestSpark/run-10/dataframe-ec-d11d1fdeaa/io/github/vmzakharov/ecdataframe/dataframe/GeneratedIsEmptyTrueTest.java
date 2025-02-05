package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsEmptyTrueTest {

    @Test
    public void isEmptyTrueTest() {
        DataFrame df = new DataFrame("Test");
        assertTrue(df.isEmpty());
    }

}