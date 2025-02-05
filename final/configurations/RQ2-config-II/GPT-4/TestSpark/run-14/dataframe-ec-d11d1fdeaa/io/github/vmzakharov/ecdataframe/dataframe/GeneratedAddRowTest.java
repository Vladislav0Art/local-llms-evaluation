package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.primitive.IntInterval;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAddRowTest {

    @Test
    public void addRowTest() {
        DataFrame dataframe = new DataFrame("test");
        dataframe.addLongColumn("Column1");
        dataframe.addRow(1);
        Assert.assertEquals(1, dataframe.rowCount());
    }

}