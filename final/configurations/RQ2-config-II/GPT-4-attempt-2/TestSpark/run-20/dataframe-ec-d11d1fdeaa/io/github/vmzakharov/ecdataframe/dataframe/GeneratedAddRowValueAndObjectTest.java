package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.ByteStringColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddRowValueAndObjectTest {

    @Test
    public void addRowValueAndObjectTest() {
        DataFrame df = new DataFrame("DataFrame1");
        df.addStringColumn("Column1");
        df.addRow("John Doe");
        Assert.assertEquals("John Doe", df.getObject("Column1", 0));
    }

}