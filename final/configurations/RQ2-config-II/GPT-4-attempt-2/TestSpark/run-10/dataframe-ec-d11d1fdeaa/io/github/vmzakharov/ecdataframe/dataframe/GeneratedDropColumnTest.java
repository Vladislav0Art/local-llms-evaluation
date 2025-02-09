package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedDropColumnTest {

    @Test
    public void dropColumnTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addStringColumn("name");
        dataFrame.dropColumn("name");
        Assert.assertFalse(dataFrame.hasColumn("name"));
    }

}