package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestJoinWithComplements {

    @Test
    public void testJoinWithComplements() {
        // Test joining two DataFrames based on a common column and selecting the complement of another column
        DataFrame df1 = new DataFrame("ColumnA", "ColumnB");
        DataFrame df2 = new DataFrame("ColumnC", "ColumnD");

        DfJoin joinDescriptor = new DfJoin(df1, "ColumnA", df2, "ColumnC");
        String result = join(joinDescriptor);
        assertEquals(3, result.getNumberOfRows());
    }

}