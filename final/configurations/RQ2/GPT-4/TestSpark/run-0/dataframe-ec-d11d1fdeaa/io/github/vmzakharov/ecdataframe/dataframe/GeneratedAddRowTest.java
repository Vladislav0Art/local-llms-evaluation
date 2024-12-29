package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddRowTest {

    @Test
    public void addRowTest() {
        DataFrame df = new DataFrame("test");
        df.addLongColumn("longCol");
        df.addRow(10L);
        assertEquals(1, df.rowCount());
    }

}