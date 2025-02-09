package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedResetBitmapTest {

    @Test
    public void resetBitmapTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addStringColumn("name");
        dataFrame.resetBitmap();
        // No assertion, just verify no exception thrown.
    }

}