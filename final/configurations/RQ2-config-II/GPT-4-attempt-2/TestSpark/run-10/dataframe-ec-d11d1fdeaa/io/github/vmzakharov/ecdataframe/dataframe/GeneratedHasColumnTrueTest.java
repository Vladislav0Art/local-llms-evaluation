package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedHasColumnTrueTest {

    @Test
    public void hasColumnTrueTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addStringColumn("name");
        Assert.assertTrue(dataFrame.hasColumn("name"));
    }

}