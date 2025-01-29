package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

public class GeneratedTestKeepColumns {

    @Test
    public void testKeepColumns() {
        DataFrame df = new DataFrame();
        df.keepColumns(Arrays.asList("column3"));
        assertNotEquals(null, df);
    }

}