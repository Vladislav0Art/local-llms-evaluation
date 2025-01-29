package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestIndex {

    @Test
    public void testIndex() {
        // Test creating an index and dropping it later
        DataFrame df = new DataFrame("ColumnA", "ColumnB");

        DfIndex index = new DfIndex(df, "ColumnA");
        assertEquals(3, index.getIndex().getNumberOfColumns());
        assertEquals(4, index.getIndex().getNumberOfRows());

        df.dropIndex(index.getName());
        assertEquals(null, df.getIndex());
    }

}