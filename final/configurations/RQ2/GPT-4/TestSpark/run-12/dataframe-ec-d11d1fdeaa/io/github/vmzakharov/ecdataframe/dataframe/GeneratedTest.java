package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Name");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addLongColumn("Age");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void addDoubleColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addDoubleColumn("Score");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void addDateColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addDateColumn("BirthDate");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void addDateTimeColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addDateTimeColumn("CreatedAt");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void addDecimalColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addDecimalColumn("GPA");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void getColumnNamedTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Name");
        Assert.assertNotNull(dataFrame.getColumnNamed("Name"));
    }

    @Test
    public void rowCountTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Name");
        dataFrame.addRow(new StringValue("John"));
        Assert.assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void columnCountTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Name");
        dataFrame.addStringColumn("Surname");
        Assert.assertEquals(2, dataFrame.columnCount());
    }

}