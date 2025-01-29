package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSortBy {

    @Test
    public void testSortBy() {
        DataFrame df = new DataFrame("test", "column1", "column2");
        df.sortBy("column1");
        assertEquals("test", df.getId());
        assertEquals("column1", df.getColumnNames().get(0));
        assertEquals("column2", df.getColumnNames().get(1));
    }

}