package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddDecimalColumnTest {

    @Test
    public void addDecimalColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addDecimalColumn("GPA");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

}