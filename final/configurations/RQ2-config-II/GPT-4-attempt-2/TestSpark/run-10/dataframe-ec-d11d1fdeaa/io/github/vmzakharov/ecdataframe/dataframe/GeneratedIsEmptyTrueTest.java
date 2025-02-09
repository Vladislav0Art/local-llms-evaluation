package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedIsEmptyTrueTest {

    @Test
    public void isEmptyTrueTest() {
        DataFrame dataFrame = new DataFrame("");
        Assert.assertTrue(dataFrame.isEmpty());
    }

}