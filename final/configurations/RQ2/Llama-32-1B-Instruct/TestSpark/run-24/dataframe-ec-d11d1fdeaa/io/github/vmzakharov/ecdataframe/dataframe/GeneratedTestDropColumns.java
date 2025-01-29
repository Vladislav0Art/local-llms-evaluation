package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

public class GeneratedTestDropColumns {

    @Test
    public void testDropColumns() {
        DataFrame df = new DataFrame();
        df.dropColumns(Arrays.asList("column1", "column2"));
        assertNotEquals(null, df);
    }

}