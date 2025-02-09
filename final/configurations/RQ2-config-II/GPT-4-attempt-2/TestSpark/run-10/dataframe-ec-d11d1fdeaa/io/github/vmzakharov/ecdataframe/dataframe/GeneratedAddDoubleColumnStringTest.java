package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedAddDoubleColumnStringTest {

    @Test
    public void addDoubleColumnStringTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addDoubleColumn("weight");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

}