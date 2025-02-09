package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.ByteStringColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedColumnCountTest {

    @Test
    public void columnCountTest() {
        DataFrame df = new DataFrame("DataFrame3");
        df.addStringColumn("Column1");
        df.addStringColumn("Column2");
        Assert.assertEquals(2, df.columnCount());
    }

}