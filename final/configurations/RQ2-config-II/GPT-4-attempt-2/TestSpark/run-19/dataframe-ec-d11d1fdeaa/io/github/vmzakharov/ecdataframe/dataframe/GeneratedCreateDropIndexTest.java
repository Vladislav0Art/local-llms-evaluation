package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.api.list.FixedSizeList;
import org.eclipse.collections.impl.factory.primitive.IntLists;
import org.eclipse.collections.impl.list.mutable.primitive.BooleanArrayList;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedCreateDropIndexTest {

    @Test
    public void createDropIndexTest() {
        DataFrame df = new DataFrame("TestDF");
        df.addStringColumn("column1");
        df.addRow("hello");
        df.createIndex("index1", FastList.newListWith("column1"));
        Assert.assertNotNull(df.index("index1"));
        df.dropIndex("index1");
        Assert.assertNull(df.index("index1"));
    }

}