package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import org.eclipse.collections.api.block.function.primitive.IntIntToIntFunction;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddDateColumnTest {

    @Test
    public void addDateColumnTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        dataFrame.addDateColumn("DateColumn");
        Assert.assertTrue(dataFrame.hasColumn("DateColumn"));
    }

}