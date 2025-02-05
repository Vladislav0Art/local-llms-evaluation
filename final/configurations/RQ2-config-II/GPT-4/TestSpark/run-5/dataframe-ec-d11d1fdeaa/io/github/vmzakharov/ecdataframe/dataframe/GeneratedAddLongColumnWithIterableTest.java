package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Maps;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedAddLongColumnWithIterableTest {

    @Test
    public void addLongColumnWithIterableTest() {
        DataFrame df = new DataFrame("TestFrame");
        String newColumnName = "TestLongColumn";
        df.addLongColumn(newColumnName, LongLists.mutable.of(1L, 2L, 3L));
        Assert.assertEquals(newColumnName, df.getColumnNamed(newColumnName).getName());
    }

}