package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.ByteStringColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsNullTest {

    @Test
    public void isNullTest() {
        DataFrame df = new DataFrame("DataFrame8");
        df.addStringColumn("Column1");
        df.addRow((Object) null);
        Assert.assertTrue(df.isNull("Column1", 0));
    }

}