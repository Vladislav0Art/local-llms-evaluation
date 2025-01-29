package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAddColumn {

    @Test
    public void testAddColumn() {
        DataFrame df = new DataFrame("test", "column1", "column2");
        df.addColumn("new_column", null, String.class);
        assertEquals("test", df.getId());
        assertEquals("column1", df.getColumnNames().get(0));
        assertEquals("column2", df.getColumnNames().get(1));
        assertEquals("new_column", df.getColumns().get(1));
    }

}