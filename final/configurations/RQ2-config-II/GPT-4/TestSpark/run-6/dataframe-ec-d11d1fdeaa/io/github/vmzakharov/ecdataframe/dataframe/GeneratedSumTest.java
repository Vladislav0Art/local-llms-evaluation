package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.eclipse.collections.impl.factory.primitive.IntLists;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.eclipse.collections.impl.map.mutable.primitive.LongLongHashMap;
import org.eclipse.collections.impl.map.mutable.primitive.ObjectLongHashMap;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

public class GeneratedSumTest {

    @Test
    public void sumTest() {
        DataFrame df = new DataFrame("testDf");
        df.addLongColumn("values", IntLists.mutable.of(1, 2, 3));
        DataFrame sumDataFrame = df.sum(FastList.newListWith("values"));
        Assert.assertEquals(6, sumDataFrame.getLong("values", 0).intValue());
    }

}