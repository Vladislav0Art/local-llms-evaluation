package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

public class GeneratedTestDropIndex {

    @Test
    public void testDropIndex() {
        DataFrame df = new DataFrame();
        df.dropIndex("index_name");
        assertNotEquals(null, df);
    }

}