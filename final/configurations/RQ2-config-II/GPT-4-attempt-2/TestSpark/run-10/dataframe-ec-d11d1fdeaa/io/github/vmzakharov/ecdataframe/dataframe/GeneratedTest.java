package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedTest {

    @Test
    public void addStringColumnStringTest() {
        DataFrame dataFrame = new DataFrame("");
        dataFrame.addStringColumn("name");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void addLongColumnStringTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addLongColumn("age");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void addDoubleColumnStringTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addDoubleColumn("weight");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void isPoolingEnabledTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.enablePooling();
        Assert.assertTrue(dataFrame.isPoolingEnabled());
    }

    @Test
    public void getColumnsZeroColumnsTest() {
        DataFrame dataFrame = new DataFrame("");
        dataFrame.getColumns();
    }

    @Test
    public void hasColumnTrueTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addStringColumn("name");
        Assert.assertTrue(dataFrame.hasColumn("name"));
    }

    @Test
    public void hasColumnFalseTest() {
        DataFrame dataFrame = new DataFrame("new");
        Assert.assertFalse(dataFrame.hasColumn("name"));
    }

    @Test
    public void rowCountEmptyFrameTest() {
        DataFrame dataFrame = new DataFrame("");
        Assert.assertEquals(0, dataFrame.rowCount());
    }

    @Test
    public void isEmptyTrueTest() {
        DataFrame dataFrame = new DataFrame("");
        Assert.assertTrue(dataFrame.isEmpty());
    }

    @Test
    public void isEmptyFalseTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addStringColumn("name");
        Assert.assertFalse(dataFrame.isEmpty());
    }

    @Test
    public void getNameTest() {
        DataFrame dataFrame = new DataFrame("new");
        Assert.assertEquals("new", dataFrame.getName());
    }

    @Test
    public void copyTest() {
        DataFrame dataFrame = new DataFrame("new");
        DataFrame copy = dataFrame.copy("copy");
        Assert.assertEquals("copy", copy.getName());
    }

    @Test
    public void distinctTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addStringColumn("name");
        dataFrame.addRow(Lists.mutable.of(new Value("John")));
        DataFrame distinct = dataFrame.distinct();
        Assert.assertEquals(1, distinct.rowCount());
    }

    @Test
    public void resetBitmapTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addStringColumn("name");
        dataFrame.resetBitmap();
        // No assertion, just verify no exception thrown.
    }

    @Test
    public void dropColumnTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addStringColumn("name");
        dataFrame.dropColumn("name");
        Assert.assertFalse(dataFrame.hasColumn("name"));
    }

    @Test
    public void addRowTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addStringColumn("name");
        dataFrame.addRow("John");
        Assert.assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void joinTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addStringColumn("name");
        DataFrame other = new DataFrame("other");
        other.addStringColumn("name");
        DataFrame joined = dataFrame.join(other, "name", "name");
        Assert.assertNotNull(joined);
    }

    @Test
    public void outerJoinTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addStringColumn("name");
        DataFrame other = new DataFrame("other");
        other.addStringColumn("name");
        DataFrame joined = dataFrame.outerJoin(other, "name", "name");
        Assert.assertNotNull(joined);
    }

    @Test
    public void isNotEmptyFalseTest() {
        DataFrame dataFrame = new DataFrame("new");
        Assert.assertFalse(dataFrame.isNotEmpty());
    }

    @Test
    public void isNotEmptyTrueTest() {
        DataFrame dataFrame = new DataFrame("new");
        dataFrame.addStringColumn("name");
        Assert.assertTrue(dataFrame.isNotEmpty());
    }

}