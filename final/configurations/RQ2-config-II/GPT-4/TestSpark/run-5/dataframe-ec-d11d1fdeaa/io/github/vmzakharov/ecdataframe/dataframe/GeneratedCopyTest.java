package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Maps;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedCopyTest {

    @Test
    public void copyTest() {
        DataFrame df1 = new DataFrame("TestFrame1");
        df1.addStringColumn("TestColumn", Lists.mutable.of("1", "2", "3"));
        DataFrame df2 = df1.copy("TestFrame2");
        Assert.assertEquals(df1.getName(), "TestFrame1");
        Assert.assertEquals(df2.getName(), "TestFrame2");
    }

}