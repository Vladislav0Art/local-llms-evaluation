package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDropColumnTest {

    @Test
    public void dropColumnTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("newCol");
        df.dropColumn("newCol");
        assertEquals(0, df.columnCount());
    }

}