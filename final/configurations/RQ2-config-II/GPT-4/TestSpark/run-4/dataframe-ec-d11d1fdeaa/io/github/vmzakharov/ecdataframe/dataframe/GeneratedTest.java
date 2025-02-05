package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void rowCountNewlyCreatedTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        assertEquals(0, dataFrame.rowCount());
    }

    @Test
    public void rowCountAfterAddingRowTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        dataFrame.addRow(Arrays.asList(Value.of("test")));
        assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void columnCountNewlyCreatedTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        assertEquals(0, dataFrame.columnCount());
    }

    @Test
    public void columnCountAfterAddingColumnTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        dataFrame.addColumn("newColumn", ValueType.STRING);
        assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void newNameTest() {
        String newName = "newName";
        DataFrame dataFrame = new DataFrame(newName);
        assertEquals(newName, dataFrame.getName());
    }

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        dataFrame.addStringColumn("newColumn");
        assertTrue(dataFrame.hasColumn("newColumn"));
    }

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        dataFrame.addLongColumn("newColumn");
        assertTrue(dataFrame.hasColumn("newColumn"));
    }

    @Test
    public void addDoubleColumnTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        dataFrame.addDoubleColumn("newColumn");
        assertTrue(dataFrame.hasColumn("newColumn"));
    }

    @Test
    public void addDateColumnTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        dataFrame.addDateColumn("newColumn");
        assertTrue(dataFrame.hasColumn("newColumn"));
    }

    @Test
    public void addDateTimeColumnTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        dataFrame.addDateTimeColumn("newColumn");
        assertTrue(dataFrame.hasColumn("newColumn"));
    }

    @Test
    public void addDecimalColumnTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        dataFrame.addDecimalColumn("newColumn");
        assertTrue(dataFrame.hasColumn("newColumn"));
    }

    @Test
    public void poolEnabledTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        dataFrame.enablePooling();
        assertTrue(dataFrame.isPoolingEnabled());
    }

}