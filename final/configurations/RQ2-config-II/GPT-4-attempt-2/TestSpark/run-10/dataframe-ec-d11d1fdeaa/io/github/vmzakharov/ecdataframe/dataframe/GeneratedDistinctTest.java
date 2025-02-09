package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedDistinctTest {

    @Test
    public void distinctTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addStringColumn("name");
        dataFrame.addRow(Lists.mutable.of(new Value("John")));
        DataFrame distinct = dataFrame.distinct();
        Assert.assertEquals(1, distinct.rowCount());
    }

}