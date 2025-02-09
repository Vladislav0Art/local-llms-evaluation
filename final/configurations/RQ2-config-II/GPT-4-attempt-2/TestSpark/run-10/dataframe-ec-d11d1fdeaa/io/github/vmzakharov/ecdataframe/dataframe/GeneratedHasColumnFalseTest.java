package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedHasColumnFalseTest {

    @Test
    public void hasColumnFalseTest() {
        DataFrame dataFrame = new DataFrame("new");
        Assert.assertFalse(dataFrame.hasColumn("name"));
    }

}