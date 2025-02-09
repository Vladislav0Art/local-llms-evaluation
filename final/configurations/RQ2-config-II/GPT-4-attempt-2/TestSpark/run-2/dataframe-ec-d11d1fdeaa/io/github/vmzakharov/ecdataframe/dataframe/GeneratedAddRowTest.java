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

public class GeneratedAddRowTest {

    @Test
    public void addRowTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        dataFrame.addStringColumn("Column1");
        ImmutableList<Value> rowValues = Arrays.asList(new Value[]{new Value("Test1"), new Value("Test2")});
        dataFrame.addRow(rowValues);
        Assert.assertEquals(1, dataFrame.rowCount());
        Assert.assertEquals("Test1", dataFrame.getString("Column1", 0));
    }

}