package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSortByTest {

    @Test
    public void sortByTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addStringColumn("name");
        df.addLongColumn("age");
        df.addRow(Lists.mutable.of("John", 25L));
        df.addRow(Lists.mutable.of("Alex", 50L));
        df.sortBy(Lists.mutable.of("name"), Lists.mutable.of(DfColumnSortOrder.ASC));
        Assert.assertEquals("Alex", df.getObject("name", 1));
    }

}