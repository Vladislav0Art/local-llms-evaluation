package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        Assert.assertEquals("TestFrame", dataFrame.getName());
    }

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addStringColumn("TestColumn");
        Assert.assertTrue(dataFrame.hasColumn("TestColumn"));
    }

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addLongColumn("TestLongColumn");
        Assert.assertTrue(dataFrame.hasColumn("TestLongColumn"));
    }

    @Test
    public void asCsvStringTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addStringColumn("CString").last().add("A");
        dataFrame.addStringColumn("DString").last().add("B");
        String expectedCSV = "CString,DString\nA,B\n";
        Assert.assertEquals(expectedCSV, dataFrame.asCsvString());
    }

    @Test
    public void addRowTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addStringColumn("scolumn");
        dataFrame.addLongColumn("lcolumn");
        dataFrame.addRow(Lists.mutable.with(ValueType.STRING.newValue("hello"), ValueType.LONG.newValue(12L)));
        Assert.assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void aggregateTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addLongColumn("lcolumn");
        dataFrame.addRow(Lists.mutable.with(ValueType.LONG.newValue(1L)));
        dataFrame.addRow(Lists.mutable.with(ValueType.LONG.newValue(2L)));
        dataFrame.addRow(Lists.mutable.with(ValueType.LONG.newValue(3L)));
        DataFrame aggDf = dataFrame.sum(Lists.mutable.with("lcolumn"));
        Assert.assertEquals(1, aggDf.rowCount());
        Assert.assertEquals(6L, aggDf.getLong("lcolumn", 0));
    }

    @Test
    public void removeFromColumnTest() {
        DataFrame base = new DataFrame("base");
        base.addStringColumn("test");
        base.addRow(Lists.mutable.with(ValueType.STRING.newValue("Hello")));
        base.dropColumn("test");
        Assert.assertFalse(base.hasColumn("test"));
    }

}