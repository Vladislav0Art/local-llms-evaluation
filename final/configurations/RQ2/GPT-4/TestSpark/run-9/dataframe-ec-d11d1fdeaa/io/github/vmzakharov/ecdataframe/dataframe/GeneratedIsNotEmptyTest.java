package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsNotEmptyTest {

    @Test
    public void isNotEmptyTest() {
        DataFrame df = new DataFrame("Test");
        assertFalse(df.isNotEmpty());
        df.addRow();
        assertTrue(df.isNotEmpty());
    }

}