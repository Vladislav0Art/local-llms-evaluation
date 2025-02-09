package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.doReturn;

import org.mockito.Spy;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Spy
    private DataFrame testDataFrame = new DataFrame("TestDF");

    @Test
    public void addStringColumnTest() {
        testDataFrame.addStringColumn("TestColumn");
        assertEquals(1, testDataFrame.columnCount());
        assertTrue(testDataFrame.hasColumn("TestColumn"));
    }

    @Test
    public void addLongColumnTest() {
        testDataFrame.addLongColumn("TestLongColumn");
        assertEquals(1, testDataFrame.columnCount());
        assertTrue(testDataFrame.hasColumn("TestLongColumn"));
    }

    @Test
    public void addDoubleColumnTest() {
        testDataFrame.addDoubleColumn("TestDoubleColumn");
        assertEquals(1, testDataFrame.columnCount());
        assertTrue(testDataFrame.hasColumn("TestDoubleColumn"));
    }

    @Test
    public void enablePoolingTest() {
        testDataFrame.enablePooling();
        assertTrue(testDataFrame.isPoolingEnabled());
    }

    @Test
    public void addRowTest() {
        testDataFrame.addStringColumn("TestStringColumn");
        testDataFrame.addRow("Test Value");
        assertEquals(1, testDataFrame.rowCount());
    }

    @Test
    public void addColumnTest() {
        testDataFrame.addColumn("TestColumn", ValueType.STRING);
        assertEquals(1, testDataFrame.columnCount());
        assertTrue(testDataFrame.hasColumn("TestColumn"));
    }

    @Test
    public void getColumnNamedTest() {
        testDataFrame.addStringColumn("TestStringColumn");
        assertNotNull(testDataFrame.getColumnNamed("TestStringColumn"));
    }

    @Test
    public void getColumnsTest() {
        testDataFrame.addStringColumn("TestStringColumn1");
        testDataFrame.addStringColumn("TestStringColumn2");
        assertEquals(2, testDataFrame.getColumns().size());
    }

    @Test
    public void getEvalContextTest() {
        assertNotNull(testDataFrame.getEvalContext());
    }

    @Test
    public void getLongColumnTest() {
        testDataFrame.addLongColumn("TestLongColumn");
        assertNotNull(testDataFrame.getLongColumn("TestLongColumn"));
    }

    @Test
    public void getStringColumnTest() {
        testDataFrame.addStringColumn("TestStringColumn");
        assertNotNull(testDataFrame.getStringColumn("TestStringColumn"));
    }

    @Test
    public void getDoubleColumnTest() {
        testDataFrame.addDoubleColumn("TestDoubleColumn");
        assertNotNull(testDataFrame.getDoubleColumn("TestDoubleColumn"));
    }

    @Test
    public void unsortTest() {
        testDataFrame.addStringColumn("TestStringColumn");
        testDataFrame.addRow("B");
        testDataFrame.addRow("A");
        testDataFrame.sortBy(Lists.immutable.of("TestStringColumn"));

        assertEquals("A", testDataFrame.getString("TestStringColumn", 0));

        testDataFrame.unsort();
        assertEquals("B", testDataFrame.getString("TestStringColumn", 0));
    }

    @Test
    public void isEmptyTest() {
        assertTrue(testDataFrame.isEmpty());
    }

    @Test
    public void isNotEmptyTest() {
        testDataFrame.addStringColumn("TestStringColumn");
        testDataFrame.addRow("Test Value");
        assertTrue(testDataFrame.isNotEmpty());
    }

}