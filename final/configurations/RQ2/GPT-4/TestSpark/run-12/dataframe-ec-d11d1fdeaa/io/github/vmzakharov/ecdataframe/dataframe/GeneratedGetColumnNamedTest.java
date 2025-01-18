package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetColumnNamedTest {

    @Test
    public void getColumnNamedTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Name");
        Assert.assertNotNull(dataFrame.getColumnNamed("Name"));
    }

}