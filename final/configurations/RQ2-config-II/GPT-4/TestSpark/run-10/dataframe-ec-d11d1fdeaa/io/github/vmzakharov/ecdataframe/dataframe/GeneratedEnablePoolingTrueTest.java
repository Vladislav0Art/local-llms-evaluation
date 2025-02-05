package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEnablePoolingTrueTest {

    @Test
    public void enablePoolingTrueTest() {
        DataFrame df = new DataFrame("Test");
        df.enablePooling();
        assertTrue(df.isPoolingEnabled());
    }

}