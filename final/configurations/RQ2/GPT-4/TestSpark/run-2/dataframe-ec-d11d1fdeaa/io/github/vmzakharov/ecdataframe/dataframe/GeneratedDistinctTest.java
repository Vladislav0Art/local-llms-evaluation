package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedDistinctTest {

    @Test
    public void distinctTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addStringColumn("name");
        df.addRow("John");
        df.addRow("John");
        Assert.assertEquals(2, df.rowCount());
        df.distinct();
        Assert.assertEquals(1, df.rowCount());
    }

}