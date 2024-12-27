package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        DataFrame df = new DataFrame("testing");
        assertTrue(df.isEmpty());
    }

}