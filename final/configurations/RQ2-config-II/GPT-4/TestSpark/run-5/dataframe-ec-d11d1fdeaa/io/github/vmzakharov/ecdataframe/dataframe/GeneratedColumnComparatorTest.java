package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Maps;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedColumnComparatorTest {

    @Test
    public void columnComparatorTest() {
        DataFrame df1 = new DataFrame("TestFrame1");
        df1.addLongColumn("TestColumnName", LongLists.mutable.of(3L, 2L, 1L));
        DataFrame df2 = new DataFrame("TestFrame2");
        df2.addLongColumn("TestColumnName", LongLists.mutable.of(3L, 2L, 1L));
        Assert.assertEquals(0, df1.columnComparator(df2, "TestColumnName", "TestColumnName").compare(0, 0));
    }

}