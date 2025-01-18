package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddLongColumnTest {

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addLongColumn("Age");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

}