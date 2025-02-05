package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddStringColumnTest {

    @Test
    public void addStringColumnTest() {
        DataFrame df = new DataFrame("Test");
        df.addStringColumn("newCol");
        assertNotNull(df.getStringColumn("newCol"));
    }

}