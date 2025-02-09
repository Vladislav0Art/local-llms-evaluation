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

public class GeneratedAddDateColumnTest {

    @Test
    public void addDateColumnTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        dataFrame.addDateColumn("Column1", Lists.mutable.with(LocalDate.now(), LocalDate.now()));
        Assert.assertEquals(2, dataFrame.rowCount());
        Assert.assertEquals(LocalDate.now(), dataFrame.getDate("Column1", 0));
    }

}