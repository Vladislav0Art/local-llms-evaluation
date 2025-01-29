package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

public class GeneratedTestCreateWithKeepColumns {

    @Test
    public void testCreateWithKeepColumns() {
        DataFrame df = new DataFrame();
        df.createIndex("index_name", Arrays.asList("column1", "column2"));
        df.keepColumns(Arrays.asList("column3"));
        assertEquals(4, df.getRowCount());
    }

}