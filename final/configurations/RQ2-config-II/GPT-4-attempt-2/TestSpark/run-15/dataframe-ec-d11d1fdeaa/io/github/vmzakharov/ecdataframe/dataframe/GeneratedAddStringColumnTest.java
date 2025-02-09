package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddStringColumnTest {

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addStringColumn("TestColumn");
        Assert.assertTrue(dataFrame.hasColumn("TestColumn"));
    }

}