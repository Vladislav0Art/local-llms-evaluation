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

public class GeneratedAddStringColumnWithExpressionTest {

    @Test
    public void addStringColumnWithExpressionTest() {
        DataFrame df = new DataFrame("testDf");
        df.addStringColumn("names", "['Mike', 'Lucy', 'John']");
        Assert.assertEquals(true, df.hasColumn("names"));
    }

}