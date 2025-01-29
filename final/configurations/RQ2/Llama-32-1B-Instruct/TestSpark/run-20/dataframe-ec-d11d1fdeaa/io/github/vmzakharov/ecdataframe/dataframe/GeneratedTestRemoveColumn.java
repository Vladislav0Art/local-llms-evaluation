package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestRemoveColumn {

    @Test
    public void testRemoveColumn() {
        DataFrame df = new DataFrame("test", "column1", "column2");
        df.removeColumn("column1");
        assertEquals("test", df.getId());
        assertEquals("column2", df.getColumnNames().get(0));
    }

}