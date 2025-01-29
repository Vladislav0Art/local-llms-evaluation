package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestJoin {

    @Test
    public void testJoin() {
        DataFrame df1 = new DataFrame("df1", "column1", "column2");
        DataFrame df2 = new DataFrame("df2", "column3", "column4");

        String[] joinColumns = {"column1", "column3"};
        int joinIndex = 0;
        String otherJoinColumnName = "other_column_name";
        DfJoin joinDescriptor = new DfJoin(df1, joinColumns, joinIndex, otherJoinColumnName);

        DataFrame df = join(df1, joinDescriptor);
        assertEquals("df2", df.getId());
        assertEquals("column1", df.getColumnNames().get(0));
        assertEquals("other_column_name", df.getColumns().get(1));

        String[] otherJoinColumns = {"column3"};
        joinDescriptor = new DfJoin(df2, otherJoinColumns, 0, "other_join_column_name");
        df = join(df2, joinDescriptor);
        assertEquals("df1", df.getId());
        assertEquals("column4", df.getColumnNames().get(0));
    }

}