package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddStringColumnTest {

    @Test
    public void addStringColumnTest() {
        DataFrame df = new DataFrame("Test");
        df.addStringColumn("Column1");
        assertEquals(1, df.columnCount());
        assertEquals("Column1", df.getColumnAt(0).getName());
    }

}