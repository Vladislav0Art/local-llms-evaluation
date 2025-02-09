package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedRowCountEmptyFrameTest {

    @Test
    public void rowCountEmptyFrameTest() {
        DataFrame dataFrame = new DataFrame("");
        Assert.assertEquals(0, dataFrame.rowCount());
    }

}