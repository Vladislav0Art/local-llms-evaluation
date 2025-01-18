package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAggregateByTest {

    @Test
    public void aggregateByTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addStringColumn("name");
        df.addLongColumn("salary");
        df.addRow(Lists.mutable.of("John", 50000L));
        df.addRow(Lists.mutable.of("Alex", 60000L));
        df.aggregateBy(Lists.mutable.of(t -> t.count()), Lists.mutable.of("name"));
        Assert.assertEquals(2, df.getColumns().size());
    }

}