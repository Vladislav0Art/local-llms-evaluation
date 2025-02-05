package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Maps;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedSortByTest {

    @Test
    public void sortByTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addLongColumn("TestColumnName", LongLists.mutable.of(3L, 2L, 1L));
        df.sortBy(Lists.mutable.of("TestColumnName"), Lists.mutable.of(DfColumnSortOrder.ASC));
        Assert.assertEquals(1L, df.getLong("TestColumnName", 0));
    }

}