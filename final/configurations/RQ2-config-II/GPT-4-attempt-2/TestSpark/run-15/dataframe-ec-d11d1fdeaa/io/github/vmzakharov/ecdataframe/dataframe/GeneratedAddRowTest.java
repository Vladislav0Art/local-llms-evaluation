package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddRowTest {

    @Test
    public void addRowTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addStringColumn("scolumn");
        dataFrame.addLongColumn("lcolumn");
        dataFrame.addRow(Lists.mutable.with(ValueType.STRING.newValue("hello"), ValueType.LONG.newValue(12L)));
        Assert.assertEquals(1, dataFrame.rowCount());
    }

}