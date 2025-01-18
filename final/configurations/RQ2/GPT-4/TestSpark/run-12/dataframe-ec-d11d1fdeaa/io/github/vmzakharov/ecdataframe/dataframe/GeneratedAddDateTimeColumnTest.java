package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddDateTimeColumnTest {

    @Test
    public void addDateTimeColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addDateTimeColumn("CreatedAt");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

}