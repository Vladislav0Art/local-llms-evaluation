package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedCopyTest {

    @Test
    public void copyTest() {
        DataFrame dataFrame = new DataFrame("new");
        DataFrame copy = dataFrame.copy("copy");
        Assert.assertEquals("copy", copy.getName());
    }

}