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

public class GeneratedTest {

    @Test
    public void addStringColumnWithExpressionTest() {
        DataFrame df = new DataFrame("testDf");
        df.addStringColumn("names", "['Mike', 'Lucy', 'John']");
        Assert.assertEquals(true, df.hasColumn("names"));
    }

    @Test
    public void addLongColumnWithValuesTest() {
        DataFrame df = new DataFrame("testDf");
        df.addLongColumn("values", IntLists.mutable.of(1, 2, 3));
        Assert.assertEquals(2, df.getLong("values", 1).intValue());
    }

    @Test
    public void newColumnTest() {
        DataFrame df = new DataFrame("testDf");
        df.newColumn("age", null);
        Assert.assertEquals(false, df.hasColumn("age"));
    }

    @Test
    public void sumTest() {
        DataFrame df = new DataFrame("testDf");
        df.addLongColumn("values", IntLists.mutable.of(1, 2, 3));
        DataFrame sumDataFrame = df.sum(FastList.newListWith("values"));
        Assert.assertEquals(6, sumDataFrame.getLong("values", 0).intValue());
    }

    @Test
    public void distinctTest() {
        DataFrame df = new DataFrame("testDf");
        df.addStringColumn("names", FastList.newListWith("Mike", "Lucy", "Mike"));
        DataFrame distinctDataFrame = df.distinct();
        Assert.assertEquals(2, distinctDataFrame.rowCount());
    }

    @Test
    public void unsortTest() {
        DataFrame df = new DataFrame("testDf");
        df.addStringColumn("names", FastList.newListWith("Mike", "Lucy", "Mike"));

        DataFrame sortedDf = df.sortBy(FastList.newListWith("names"));
        Assert.assertEquals("Lucy", sortedDf.getString("names", 0));

        sortedDf.unsort();
        Assert.assertEquals("Mike", sortedDf.getString("names", 0));
    }

    @Test
    public void copyTest() {
        DataFrame df = new DataFrame("testDf");
        df.addStringColumn("names", FastList.newListWith("Mike", "Lucy", "Mike"));

        DataFrame copiedDf = df.copy("copiedDf", FastList.newListWith("names"));
        Assert.assertEquals(3, copiedDf.rowCount());
        Assert.assertEquals("copiedDf", copiedDf.getName());
    }

    @Test
    public void dropColumnTest() {
        DataFrame df = new DataFrame("testDf");
        df.addStringColumn("names", FastList.newListWith("Mike", "Lucy", "Mike"));
        df.dropColumn("names");
        Assert.assertFalse(df.hasColumn("names"));
    }

    @Test
    public void isEmptyTest() {
        DataFrame df = new DataFrame("testDf");
        Assert.assertTrue(df.isEmpty());
    }

    @Test
    public void isNotEmptyTest() {
        DataFrame df = new DataFrame("testDf");
        df.addLongColumn("values", IntLists.mutable.of(1, 2, 3));
        Assert.assertTrue(df.isNotEmpty());
    }

    @Test
    public void createIndexTest() {
        DataFrame df = new DataFrame("testDf");
        df.addLongColumn("values", IntLists.mutable.of(1, 2, 3));
        df.createIndex("index1", FastList.newListWith("values"));
        Assert.assertNotNull(df.index("index1"));
    }

    @Test
    public void dropIndexTest() {
        DataFrame df = new DataFrame("testDf");
        df.addLongColumn("values", IntLists.mutable.of(1, 2, 3));
        df.createIndex("index1", FastList.newListWith("values"));
        df.dropIndex("index1");
        Assert.assertNull(df.index("index1"));
    }

}