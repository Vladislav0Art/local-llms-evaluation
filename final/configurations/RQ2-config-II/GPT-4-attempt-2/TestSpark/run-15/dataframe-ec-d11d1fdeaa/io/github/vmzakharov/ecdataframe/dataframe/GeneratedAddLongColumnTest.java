package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddLongColumnTest {

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addLongColumn("TestLongColumn");
        Assert.assertTrue(dataFrame.hasColumn("TestLongColumn"));
    }

}