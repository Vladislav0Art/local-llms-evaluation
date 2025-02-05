package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsNotEmptyFalseTest {

    @Test
    public void isNotEmptyFalseTest() {
        DataFrame df = new DataFrame("Test");
        assertFalse(df.isNotEmpty());
    }

}