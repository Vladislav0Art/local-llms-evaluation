package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.ByteStringColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSortUnsortTest {

    @Test
    public void sortUnsortTest() {
        DataFrame df = new DataFrame("DataFrame7");
        df.addStringColumn("Column1");
        df.addRow("John Doe");
        df.addRow("Jane Doe");
        df.sortBy(Lists.immutable.of("Column1"));
        Assert.assertEquals("Jane Doe", valueAt(0));
        df.unsort();
        Assert.assertEquals("John Doe", valueAt(0));
    }

}