package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEnablePoolingFalseTest {

    @Test
    public void enablePoolingFalseTest() {
        DataFrame df = new DataFrame("Test");
        assertFalse(df.isPoolingEnabled());
    }

}