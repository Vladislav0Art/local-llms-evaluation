package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedAddStringColumnStringTest {

    @Test
    public void addStringColumnStringTest() {
        DataFrame dataFrame = new DataFrame("");
        dataFrame.addStringColumn("name");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

}