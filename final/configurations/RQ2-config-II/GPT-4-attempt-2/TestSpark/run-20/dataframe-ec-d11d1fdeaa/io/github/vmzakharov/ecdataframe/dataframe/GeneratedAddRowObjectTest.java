package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.ByteStringColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddRowObjectTest {

    @Test
    public void addRowObjectTest() {
        DataFrame df = new DataFrame("DataFrame2");
        df.addStringColumn("Column1");
        df.addRow((Object) "John Doe");
        Assert.assertEquals("John Doe", df.getObject("Column1", 0));
    }

}