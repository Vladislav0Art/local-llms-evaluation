package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAggregateTest {

    @Test
    public void aggregateTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addStringColumn("name");
        df.addLongColumn("salary");
        df.addRow(Lists.mutable.of("John", 50000L));
        df.aggregate(Lists.mutable.of(t -> t.count()));
        Assert.assertEquals(1, df.getColumns().size());
    }

}