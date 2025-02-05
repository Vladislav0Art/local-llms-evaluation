package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRowCountTest {

    @Test
    public void rowCountTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("newCol");
        df.addRow();
        assertEquals(1, df.rowCount());
    }

}