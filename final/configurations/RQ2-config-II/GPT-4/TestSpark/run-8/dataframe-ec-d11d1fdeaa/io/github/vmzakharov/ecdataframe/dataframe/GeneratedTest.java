package io.github.vmzakharov.ecdataframe.dataframe;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnStored;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void addStringColumnTest() {
        DataFrame df = new DataFrame("testDF");

        DataFrame result = df.addStringColumn("testColumn");

        assertNotNull(result);
        assertNotNull(result.getColumnNamed("testColumn"));
        assertEquals("testColumn", result.getColumnNamed("testColumn").getName());
        assertNotNull(result.getColumnNamed("testColumn").getStore());
    }

    @Test
    public void addLongColumnTest() {
        DataFrame df = new DataFrame("testDF");

        DataFrame result = df.addLongColumn("testColumn");

        assertNotNull(result);
        assertNotNull(result.getColumnNamed("testColumn"));
        assertEquals("testColumn", result.getColumnNamed("testColumn").getName());
        assertNotNull(result.getColumnNamed("testColumn").getStore());
    }

    @Test
    public void rowCountTest() {
        DataFrame df = new DataFrame("testDF");
        df.addStringColumn("testColumn");

        int rowsCountBefore = df.rowCount();
        df.addRow();
        int rowsCountAfter = df.rowCount();

        assertEquals(0, rowsCountBefore);
        assertEquals(1, rowsCountAfter);
    }

    @Test
    public void columnCountTest() {
        DataFrame df = new DataFrame("testDF");

        int columnCountBefore = df.columnCount();
        df.addStringColumn("testColumn");
        int columnCountAfter = df.columnCount();

        assertEquals(0, columnCountBefore);
        assertEquals(1, columnCountAfter);
    }

    @Test
    public void addColumnTest() {
        DataFrame df = new DataFrame("testDF");

        DataFrame result = df.addColumn("testColumn", ValueType.STRING);

        assertNotNull(result);
        assertNotNull(result.getColumnNamed("testColumn"));
        assertEquals("testColumn", result.getColumnNamed("testColumn").getName());
        assertNotNull(result.getColumnNamed("testColumn").getStore());
    }

    @Test
    public void newColumnTest() {
        DataFrame df = new DataFrame("testDF");

        DfColumnStored result = df.newColumn("testColumn", ValueType.STRING);

        assertNotNull(result);
        assertEquals("testColumn", result.getName());
    }

    @Test
    public void isNullTest() {
        DataFrame df = new DataFrame("testDF");
        df.addStringColumn("testColumn");

        boolean isNullBefore = df.isNull("testColumn", 0);
        df.addRow(Arrays.asList(new String[]{"abc"}));
        boolean isNullAfter = df.isNull("testColumn", 0);

        assertTrue(isNullBefore);
        assertFalse(isNullAfter);
    }

    @Test
    public void hasColumnTest() {
        DataFrame df = new DataFrame("testDF");

        boolean hasColumnBefore = df.hasColumn("testColumn");
        df.addStringColumn("testColumn");
        boolean hasColumnAfter = df.hasColumn("testColumn");

        assertFalse(hasColumnBefore);
        assertTrue(hasColumnAfter);
    }

    @Test
    public void isEmptyTest() {
        DataFrame df = new DataFrame("testDF");
        df.addStringColumn("testColumn");

        boolean isEmptyBefore = df.isEmpty();
        df.addRow(Arrays.asList(new String[]{"abc"}));
        boolean isEmptyAfter = df.isEmpty();

        assertTrue(isEmptyBefore);
        assertFalse(isEmptyAfter);
    }

}