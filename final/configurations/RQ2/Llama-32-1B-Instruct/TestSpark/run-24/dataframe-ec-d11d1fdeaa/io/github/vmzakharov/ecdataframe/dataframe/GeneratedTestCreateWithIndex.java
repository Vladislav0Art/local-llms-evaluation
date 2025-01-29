package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

public class GeneratedTestCreateWithIndex {

    @Test
    public void testCreateWithIndex() {
        DataFrame df = new DataFrame();
        df.createIndex("index_name", Arrays.asList("column1", "column2"));
        assertEquals(3, df.getRowCount());
    }

}