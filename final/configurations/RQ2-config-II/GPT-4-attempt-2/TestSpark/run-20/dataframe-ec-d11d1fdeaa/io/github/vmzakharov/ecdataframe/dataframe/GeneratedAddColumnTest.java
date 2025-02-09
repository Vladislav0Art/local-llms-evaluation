package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.ByteStringColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddColumnTest {

    @Test
    public void addColumnTest() {
        DataFrame df = new DataFrame("DataFrame5");
        df.addColumn("Column1", "John Doe");
        Assert.assertEquals("John Doe", df.getString("Column1", 0));
    }

}