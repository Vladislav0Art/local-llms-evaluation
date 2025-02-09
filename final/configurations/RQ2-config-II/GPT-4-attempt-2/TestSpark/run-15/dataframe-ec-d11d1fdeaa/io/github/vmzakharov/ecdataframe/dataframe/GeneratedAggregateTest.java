package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAggregateTest {

    @Test
    public void aggregateTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addLongColumn("lcolumn");
        dataFrame.addRow(Lists.mutable.with(ValueType.LONG.newValue(1L)));
        dataFrame.addRow(Lists.mutable.with(ValueType.LONG.newValue(2L)));
        dataFrame.addRow(Lists.mutable.with(ValueType.LONG.newValue(3L)));
        DataFrame aggDf = dataFrame.sum(Lists.mutable.with("lcolumn"));
        Assert.assertEquals(1, aggDf.rowCount());
        Assert.assertEquals(6L, aggDf.getLong("lcolumn", 0));
    }

}