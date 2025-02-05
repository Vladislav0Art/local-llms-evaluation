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

public class GeneratedDistinctTest {

    @Test
    public void distinctTest() {
        DataFrame df = new DataFrame("testDf");
        df.addStringColumn("names", FastList.newListWith("Mike", "Lucy", "Mike"));
        DataFrame distinctDataFrame = df.distinct();
        Assert.assertEquals(2, distinctDataFrame.rowCount());
    }

}