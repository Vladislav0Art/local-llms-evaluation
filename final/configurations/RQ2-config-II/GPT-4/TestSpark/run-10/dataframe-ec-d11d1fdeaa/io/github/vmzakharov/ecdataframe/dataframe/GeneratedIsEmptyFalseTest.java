package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsEmptyFalseTest {

    @Test
    public void isEmptyFalseTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("newCol");
        assertFalse(df.isEmpty());
    }

}