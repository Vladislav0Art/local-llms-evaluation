package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedIsPoolingEnabledTest {

    @Test
    public void isPoolingEnabledTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.enablePooling();
        Assert.assertTrue(dataFrame.isPoolingEnabled());
    }

}