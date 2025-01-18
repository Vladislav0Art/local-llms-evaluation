package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.primitive.DoubleLists;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class GeneratedAddLongColumnTest {

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addLongColumn("Column", LongLists.mutable.with(1L, 2L, 3L));
        Assert.assertTrue(dataFrame.hasColumn("Column"));
        Assert.assertEquals(1, dataFrame.getLong("Column", 0));
        Assert.assertEquals(2, dataFrame.getLong("Column", 1));
        Assert.assertEquals(3, dataFrame.getLong("Column", 2));
    }

}