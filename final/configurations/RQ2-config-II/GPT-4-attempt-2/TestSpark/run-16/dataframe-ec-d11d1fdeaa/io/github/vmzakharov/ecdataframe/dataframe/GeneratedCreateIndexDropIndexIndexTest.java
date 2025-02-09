package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import org.eclipse.collections.api.block.function.primitive.IntIntToIntFunction;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateIndexDropIndexIndexTest {

    @Test
    public void createIndexDropIndexIndexTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        dataFrame.addStringColumn("StringColumn");
        MutableList<String> columnNames = Lists.mutable.with("StringColumn");
        dataFrame.createIndex("index1", columnNames);
        Assert.assertNotNull(dataFrame.index("index1"));
        dataFrame.dropIndex("index1");
        Assert.assertNull(dataFrame.index("index1"));
    }

}