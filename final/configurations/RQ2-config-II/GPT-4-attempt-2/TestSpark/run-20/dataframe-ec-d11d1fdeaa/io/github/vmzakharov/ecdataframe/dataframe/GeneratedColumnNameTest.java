package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.ByteStringColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedColumnNameTest {

    @Test
    public void columnNameTest() {
        DataFrame df = new DataFrame("DataFrame6");
        df.addColumn("Column1", "John Doe");
        Assert.assertTrue(df.hasColumn("Column1"));
    }

}