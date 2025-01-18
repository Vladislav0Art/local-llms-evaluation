package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRowCountTest {

    @Test
    public void rowCountTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Name");
        dataFrame.addRow(new StringValue("John"));
        Assert.assertEquals(1, dataFrame.rowCount());
    }

}