package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedOuterJoinTest {

    @Test
    public void outerJoinTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addStringColumn("name");
        DataFrame other = new DataFrame("other");
        other.addStringColumn("name");
        DataFrame joined = dataFrame.outerJoin(other, "name", "name");
        Assert.assertNotNull(joined);
    }

}