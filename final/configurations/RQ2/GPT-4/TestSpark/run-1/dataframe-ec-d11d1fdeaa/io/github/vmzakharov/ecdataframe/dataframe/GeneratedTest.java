package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void DataFrameConstructingTest() {
        DataFrame dataFrame = new DataFrame("Test");
        assertNotNull(dataFrame);
    }

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        DataFrame result = dataFrame.addStringColumn("Column1");
        assertNotNull(result);
        assertTrue(result.hasColumn("Column1"));
    }

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        DataFrame result = dataFrame.addLongColumn("Column1");
        assertNotNull(result);
        assertTrue(result.hasColumn("Column1"));
    }

    @Test
    public void addDoubleColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        DataFrame result = dataFrame.addDoubleColumn("Column1");
        assertNotNull(result);
        assertTrue(result.hasColumn("Column1"));
    }

    @Test
    public void addDateColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        DataFrame result = dataFrame.addDateColumn("Column1");
        assertNotNull(result);
        assertTrue(result.hasColumn("Column1"));
    }

    @Test
    public void addDateTimeColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        DataFrame result = dataFrame.addDateTimeColumn("Column1");
        assertNotNull(result);
        assertTrue(result.hasColumn("Column1"));
    }

    @Test
    public void addDecimalColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        DataFrame result = dataFrame.addDecimalColumn("Column1");
        assertNotNull(result);
        assertTrue(result.hasColumn("Column1"));
    }

    @Test
    public void isPoolingEnabledTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.enablePooling();
        assertTrue(dataFrame.isPoolingEnabled());
    }

    @Test
    public void addRowWithValuesTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Column1");
        dataFrame.addRow("Value");
        assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void addRowWithoutValuesTest() {
        DataFrame dataFrame = new DataFrame("Test");
        DataFrame result = dataFrame.addRow();
        assertEquals(1, result.rowCount());
    }

    @Test
    public void isEmptyTest() {
        DataFrame dataFrame = new DataFrame("Test");
        assertTrue(dataFrame.isEmpty());
    }

    @Test
    public void isNotEmptyTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Column1");
        dataFrame.addRow("Value");
        assertTrue(dataFrame.isNotEmpty());
    }

}