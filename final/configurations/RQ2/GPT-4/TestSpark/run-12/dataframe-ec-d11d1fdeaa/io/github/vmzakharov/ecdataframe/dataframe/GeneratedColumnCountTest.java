package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedColumnCountTest {

    @Test
    public void columnCountTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Name");
        dataFrame.addStringColumn("Surname");
        Assert.assertEquals(2, dataFrame.columnCount());
    }

}