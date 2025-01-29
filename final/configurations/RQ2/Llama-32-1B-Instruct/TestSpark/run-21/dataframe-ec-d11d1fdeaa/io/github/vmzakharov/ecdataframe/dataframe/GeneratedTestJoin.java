package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestJoin {

    @Test
    public void testJoin() {
        // Test joining two DataFrames based on a common column
        DataFrame df1 = new DataFrame("ColumnA", "ColumnB");
        DataFrame df2 = new DataFrame("ColumnC", "ColumnD");

        DfJoin joinDescriptor = new DfJoin(df1, "ColumnA", df2, "ColumnC");
        String result = join(joinDescriptor);
        assertEquals(3, result.getNumberOfRows());

        // Test joining two DataFrames based on different columns
        df1 = new DataFrame("ColumnE", "ColumnF");
        df2 = new DataFrame("ColumnG", "ColumnH");

        DfJoin joinDescriptor2 = new DfJoin(df1, "ColumnA", df2, "ColumnI");
        String result2 = join(joinDescriptor2);
        assertEquals(3, result2.getNumberOfRows());
    }

}