package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        DataFrame dataFrame = new DataFrame("new");
        Assert.assertEquals("new", dataFrame.getName());
    }

}