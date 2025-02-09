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

public class GeneratedAddStringColumnWithValuesTest {

    @Test
    public void addStringColumnWithValuesTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        dataFrame.addStringColumn("Column1", Lists.mutable.with("Test1", "Test2"));
        Assert.assertEquals(2, dataFrame.rowCount());
        Assert.assertEquals("Test1", dataFrame.getString("Column1", 0));
        Assert.assertEquals("Test2", dataFrame.getString("Column1", 1));
    }

}