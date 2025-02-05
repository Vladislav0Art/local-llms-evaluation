package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.IntInterval;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedUnionTest {

    @Test
    public void unionTest() {
        DataFrame df1 = new DataFrame("DF1");
        df1.addStringColumn("StringColumn")
                .addRow("a");

        DataFrame df2 = new DataFrame("DF2");
        df2.addStringColumn("StringColumn")
                .addRow("b");

        DataFrame unionDF = df1.union(df2);

        assertEquals("a", unionDF.getString("StringColumn", 0));
        assertEquals("b", unionDF.getString("StringColumn", 1));
    }

}