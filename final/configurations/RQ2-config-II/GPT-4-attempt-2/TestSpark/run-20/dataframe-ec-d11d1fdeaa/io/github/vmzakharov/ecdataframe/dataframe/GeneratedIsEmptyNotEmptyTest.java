package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.ByteStringColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsEmptyNotEmptyTest {

    @Test
    public void isEmptyNotEmptyTest() {
        DataFrame df = new DataFrame("DataFrame9");
        Assert.assertTrue(df.isEmpty());
        Assert.assertFalse(df.isNotEmpty());
        df.addStringColumn("Column1");
        df.addRow("John Doe");
        Assert.assertFalse(df.isEmpty());
        Assert.assertTrue(df.isNotEmpty());
    }

}