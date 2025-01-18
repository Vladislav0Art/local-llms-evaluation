package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsPoolingEnabledTest {

    @Test
    public void isPoolingEnabledTest() {
        DataFrame df = new DataFrame("Test");
        assertFalse(df.isPoolingEnabled());
        df.enablePooling();
        assertTrue(df.isPoolingEnabled());
    }

}