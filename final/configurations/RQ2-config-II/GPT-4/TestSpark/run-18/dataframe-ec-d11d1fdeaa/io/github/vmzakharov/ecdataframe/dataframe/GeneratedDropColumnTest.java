package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.IntInterval;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDropColumnTest {

    @Test
    public void dropColumnTest() {
        DataFrame df1 = new DataFrame("DF1");
        df1.addStringColumn("StringColumn");

        df1.dropColumn("StringColumn");

        assertEquals(0, df1.columnCount());
    }

}