package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        dataFrame.addStringColumn("Column1");
        Assert.assertEquals(1, dataFrame.columnCount());
        Assert.assertTrue(dataFrame.hasColumn("Column1"));
        Assert.assertEquals("Column1", dataFrame.getColumnAt(0).getName());
    }

    @Test
    public void rowCountTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        Assert.assertEquals(0, dataFrame.rowCount());
        dataFrame.addRow();
        Assert.assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void columnCountTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        Assert.assertEquals(0, dataFrame.columnCount());
        dataFrame.addStringColumn("Column1");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void getNameTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        Assert.assertEquals("TestDF", dataFrame.getName());
    }

    @Test
    public void hasColumnTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        Assert.assertFalse(dataFrame.hasColumn("Column1"));
        dataFrame.addStringColumn("Column1");
        Assert.assertTrue(dataFrame.hasColumn("Column1"));
    }

    @Test
    public void isEmptyNotEmptyTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        Assert.assertTrue(dataFrame.isEmpty());
        Assert.assertFalse(dataFrame.isNotEmpty());
        dataFrame.addRow();
        Assert.assertFalse(dataFrame.isEmpty());
        Assert.assertTrue(dataFrame.isNotEmpty());
    }

}