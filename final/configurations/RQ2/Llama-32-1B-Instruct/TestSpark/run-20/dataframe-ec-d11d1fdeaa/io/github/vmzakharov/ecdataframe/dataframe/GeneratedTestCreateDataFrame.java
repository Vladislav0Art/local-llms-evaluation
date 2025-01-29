package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCreateDataFrame {

    @Test
    public void testCreateDataFrame() {
        DataFrame df = new DataFrame("test", "column1", "column2");
        assertEquals("test", df.getId());
        assertEquals("column1", df.getColumnNames().get(0));
        assertEquals("column2", df.getColumnNames().get(1));
    }

}