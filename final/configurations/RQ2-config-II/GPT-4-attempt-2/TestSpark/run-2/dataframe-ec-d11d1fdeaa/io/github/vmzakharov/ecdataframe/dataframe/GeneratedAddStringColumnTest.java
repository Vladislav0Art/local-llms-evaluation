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

public class GeneratedAddStringColumnTest {

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        dataFrame.addStringColumn("Column1");
        Assert.assertEquals(1, dataFrame.columnCount());
        Assert.assertTrue(dataFrame.hasColumn("Column1"));
    }

}