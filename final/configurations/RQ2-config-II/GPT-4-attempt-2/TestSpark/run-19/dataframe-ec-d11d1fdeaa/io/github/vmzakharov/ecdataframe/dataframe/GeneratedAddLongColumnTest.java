package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.api.list.FixedSizeList;
import org.eclipse.collections.impl.factory.primitive.IntLists;
import org.eclipse.collections.impl.list.mutable.primitive.BooleanArrayList;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedAddLongColumnTest {

    @Test
    public void addLongColumnTest() {
        DataFrame df = new DataFrame("TestDF");
        df.addLongColumn("column1", IntLists.immutable.of(1, 2, 3));
        Assert.assertEquals(1, df.getLong("column1", 0));
    }

}