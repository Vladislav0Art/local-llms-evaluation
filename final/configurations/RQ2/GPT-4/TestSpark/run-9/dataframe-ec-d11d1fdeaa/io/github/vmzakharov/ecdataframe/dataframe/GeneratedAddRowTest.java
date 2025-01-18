package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddRowTest {

    @Test
    public void addRowTest() {
        DataFrame df = new DataFrame("Test");
        df.addStringColumn("Column1");
        df.addRow("test");
        assertEquals(1, df.rowCount());
        assertEquals("test", df.getObject(0, 0));
    }

}