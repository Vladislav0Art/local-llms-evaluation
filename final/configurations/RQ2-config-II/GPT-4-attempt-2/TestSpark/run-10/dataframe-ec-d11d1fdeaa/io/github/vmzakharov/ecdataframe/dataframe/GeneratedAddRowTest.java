package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedAddRowTest {

    @Test
    public void addRowTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addStringColumn("name");
        dataFrame.addRow("John");
        Assert.assertEquals(1, dataFrame.rowCount());
    }

}