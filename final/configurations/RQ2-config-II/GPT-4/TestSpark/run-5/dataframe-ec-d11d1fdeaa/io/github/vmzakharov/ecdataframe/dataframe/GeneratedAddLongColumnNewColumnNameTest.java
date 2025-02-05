package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Maps;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedAddLongColumnNewColumnNameTest {

    @Test
    public void addLongColumnNewColumnNameTest() {
        DataFrame df = new DataFrame("TestFrame");
        String newColumnName = "TestLongColumn";
        df.addLongColumn(newColumnName);
        Assert.assertEquals(newColumnName, df.getColumnNamed(newColumnName).getName());
    }

}