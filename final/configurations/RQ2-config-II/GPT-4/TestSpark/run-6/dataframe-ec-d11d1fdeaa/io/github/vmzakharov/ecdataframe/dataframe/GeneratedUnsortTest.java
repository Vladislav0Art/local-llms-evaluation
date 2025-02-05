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

public class GeneratedUnsortTest {

    @Test
    public void unsortTest() {
        DataFrame df = new DataFrame("testDf");
        df.addStringColumn("names", FastList.newListWith("Mike", "Lucy", "Mike"));

        DataFrame sortedDf = df.sortBy(FastList.newListWith("names"));
        Assert.assertEquals("Lucy", sortedDf.getString("names", 0));

        sortedDf.unsort();
        Assert.assertEquals("Mike", sortedDf.getString("names", 0));
    }

}