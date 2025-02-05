package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddLongColumnTest {

    @Test
    public void addLongColumnTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("newCol");
        assertNotNull(df.getLongColumn("newCol"));
    }

}