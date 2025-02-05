package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Assert;
import org.junit.Test;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addStringColumn("TestColumn");

        Assert.assertEquals(1, dataFrame.columnCount());
        Assert.assertEquals("TestColumn", dataFrame.getColumnAt(0).getName());
    }

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addLongColumn("TestColumn");

        Assert.assertEquals(1, dataFrame.columnCount());
        Assert.assertEquals("TestColumn", dataFrame.getColumnAt(0).getName());
    }

    @Test
    public void addDecimalColumnTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addDecimalColumn("TestColumn");

        Assert.assertEquals(1, dataFrame.columnCount());
        Assert.assertEquals("TestColumn", dataFrame.getColumnAt(0).getName());
    }

    @Test
    public void isPoolingEnabledTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        Assert.assertFalse(dataFrame.isPoolingEnabled());

        dataFrame.enablePooling();
        Assert.assertTrue(dataFrame.isPoolingEnabled());
    }

    @Test
    public void addColumnTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        DfColumn column = dataFrame.addColumn("TestColumn", ValueType.DOUBLE);

        Assert.assertEquals(1, dataFrame.columnCount());
        Assert.assertEquals("TestColumn", column.getName());
    }

    @Test
    public void getColumnNamedNotFoundTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addStringColumn("OneColumn");

        dataFrame.getColumnNamed("WrongName"); // throws exception
    }

    @Test
    public void columnCountTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addStringColumn("OneColumn");
        dataFrame.addStringColumn("TwoColumn");
        dataFrame.addStringColumn("ThreeColumn");

        Assert.assertEquals(3, dataFrame.columnCount());
    }

    @Test
    public void rowCountEmptyTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        Assert.assertEquals(0, dataFrame.rowCount());
    }

    @Test
    public void rowCountTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addStringColumn("OneColumn");
        dataFrame.addRow(List.of(Value.of("TestData")));

        Assert.assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void getNameTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");

        Assert.assertEquals("TestFrame", dataFrame.getName());
    }

    @Test
    public void hasColumnTrueTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addStringColumn("OneColumn");

        Assert.assertTrue(dataFrame.hasColumn("OneColumn"));
    }

    @Test
    public void hasColumnFalseTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addStringColumn("OneColumn");

        Assert.assertFalse(dataFrame.hasColumn("WrongName"));
    }

}