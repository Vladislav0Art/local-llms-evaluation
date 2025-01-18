package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        DataFrame df = new DataFrame("Test");
        assertTrue(df.isEmpty());
        df.addRow();
        assertFalse(df.isEmpty());
    }

}