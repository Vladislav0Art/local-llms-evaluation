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

public class GeneratedAddDoubleColumnTest {

    @Test
    public void addDoubleColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addDoubleColumn("Column", DoubleLists.mutable.with(1.1, 2.2, 3.3));
        Assert.assertTrue(dataFrame.hasColumn("Column"));
        Assert.assertEquals(1.1, dataFrame.getDouble("Column", 0), 0.01);
        Assert.assertEquals(2.2, dataFrame.getDouble("Column", 1), 0.01);
        Assert.assertEquals(3.3, dataFrame.getDouble("Column", 2), 0.01);
    }

}