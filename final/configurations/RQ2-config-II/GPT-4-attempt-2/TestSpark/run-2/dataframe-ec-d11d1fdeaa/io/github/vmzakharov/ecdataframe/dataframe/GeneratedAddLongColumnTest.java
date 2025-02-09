package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

public class GeneratedAddLongColumnTest {

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        dataFrame.addLongColumn("Column1", LongLists.mutable.with(1L, 2L, 3L));
        Assert.assertEquals(3, dataFrame.rowCount());
        Assert.assertEquals(1, dataFrame.getLong("Column1", 0));
        Assert.assertEquals(2, dataFrame.getLong("Column1", 1));
        Assert.assertEquals(3, dataFrame.getLong("Column1", 2));
    }

}