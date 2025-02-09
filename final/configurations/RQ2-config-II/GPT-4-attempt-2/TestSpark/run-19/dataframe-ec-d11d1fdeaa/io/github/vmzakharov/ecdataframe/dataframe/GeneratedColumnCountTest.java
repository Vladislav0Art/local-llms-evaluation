package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.api.list.FixedSizeList;
import org.eclipse.collections.impl.factory.primitive.IntLists;
import org.eclipse.collections.impl.list.mutable.primitive.BooleanArrayList;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedColumnCountTest {

    @Test
    public void columnCountTest() {
        DataFrame df = new DataFrame("TestDF");
        df.addStringColumn("column1");
        df.addDoubleColumn("column2");
        Assert.assertEquals(2, df.columnCount());
    }

}