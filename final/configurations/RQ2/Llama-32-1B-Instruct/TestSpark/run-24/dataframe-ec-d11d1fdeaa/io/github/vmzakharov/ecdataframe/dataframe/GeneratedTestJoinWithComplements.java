package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

public class GeneratedTestJoinWithComplements {

    @Test
    public void testJoinWithComplements() {
        DataFrame df1 = new DataFrame();
        df1.createIndex("index_name_1", Arrays.asList("column1", "column2"));
        df1.dropIndex("index_name_1");

        DataFrame df2 = new DataFrame();
        df2.createIndex("index_name_2", Arrays.asList("column3", "column4"));

        DataFrame joinedDf = df1.join(df2, "index_name_1", "index_name_2");
        assertEquals(2, joinedDf.getRowCount());
    }

}