package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

public class GeneratedTestGetIndexName {

    @Test
    public void testGetIndexName() {
        DataFrame df = new DataFrame();
        String indexName = df.getIndex("column_name");
        assertEquals("column_name", indexName);
    }

}