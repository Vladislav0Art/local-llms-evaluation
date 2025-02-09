package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.api.list.FixedSizeList;
import org.eclipse.collections.impl.factory.primitive.IntLists;
import org.eclipse.collections.impl.list.mutable.primitive.BooleanArrayList;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedAddDoubleColumnTest {

    @Test
    public void addDoubleColumnTest() {
        DataFrame df = new DataFrame("TestDF");
        df.addDoubleColumn("column1", FastList.newListWith(1.23, 4.56));
        Assert.assertEquals(1.23, df.getDouble("column1", 0), 0.0001);
    }

}