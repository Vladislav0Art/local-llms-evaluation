package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void DataFrameNewNameTest() {
        DataFrame dataFrame = new DataFrame("Test");
        assertEquals("Test", dataFrame.getName());
    }

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("newCol");
        assertTrue(dataFrame.hasColumn("newCol"));
    }

    @Test
    public void isPoolingEnabledTest() {
        DataFrame dataFrame = new DataFrame("Test");
        assertFalse(dataFrame.isPoolingEnabled());
    }

    @Test
    public void enablePoolingTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.enablePooling();
        assertTrue(dataFrame.isPoolingEnabled());
    }

    @Test
    public void rowCountTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("col1");
        dataFrame.addRow(Lists.immutable.of(Value.of("Test")));
        assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void getEvalContextTest() {
        DataFrame dataFrame = new DataFrame("Test");
        assertNotNull(dataFrame.getEvalContext());
    }

    @Test
    public void hasColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("column1");
        assertTrue(dataFrame.hasColumn("column1"));
    }

    @Test
    public void addRowTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("column1");
        dataFrame.addRow(Lists.immutable.of(Value.of("val1")));
        assertEquals("val1", dataFrame.getString("column1", 0));
    }

    @Test
    public void columnCountTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("column1");
        dataFrame.addStringColumn("column2");
        assertEquals(2, dataFrame.columnCount());
    }

    @Test
    public void isEmptyTest() {
        DataFrame dataFrame = new DataFrame("Test");
        assertTrue(dataFrame.isEmpty());
    }

    @Test
    public void isNotEmptyTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("column1");
        dataFrame.addRow(Lists.immutable.of(Value.of("Test")));
        assertTrue(dataFrame.isNotEmpty());
    }

    @Test
    public void asCsvStringTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("column1");
        dataFrame.addRow(Lists.immutable.of(Value.of("Test")));
        assertEquals("column1\nTest\n", dataFrame.asCsvString());
    }

}