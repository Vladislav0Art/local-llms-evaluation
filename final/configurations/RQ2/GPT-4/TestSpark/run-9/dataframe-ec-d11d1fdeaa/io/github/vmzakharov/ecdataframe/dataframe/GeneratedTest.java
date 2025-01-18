package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addStringColumnTest() {
        DataFrame df = new DataFrame("Test");
        df.addStringColumn("Column1");
        assertEquals(1, df.columnCount());
        assertEquals("Column1", df.getColumnAt(0).getName());
    }

    @Test
    public void addLongColumnTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("Column1");
        assertEquals(1, df.columnCount());
        assertEquals("Column1", df.getColumnAt(0).getName());
    }

    @Test
    public void addDoubleColumnTest() {
        DataFrame df = new DataFrame("Test");
        df.addDoubleColumn("Column1");
        assertEquals(1, df.columnCount());
        assertEquals("Column1", df.getColumnAt(0).getName());
    }

    @Test
    public void addRowTest() {
        DataFrame df = new DataFrame("Test");
        df.addStringColumn("Column1");
        df.addRow("test");
        assertEquals(1, df.rowCount());
        assertEquals("test", df.getObject(0, 0));
    }

    @Test
    public void getNameTest() {
        DataFrame df = new DataFrame("Test");
        assertEquals("Test", df.getName());
    }

    @Test
    public void hasColumnTest() {
        DataFrame df = new DataFrame("Test");
        df.addStringColumn("Column1");
        assertTrue(df.hasColumn("Column1"));
    }

    @Test
    public void isPoolingEnabledTest() {
        DataFrame df = new DataFrame("Test");
        assertFalse(df.isPoolingEnabled());
        df.enablePooling();
        assertTrue(df.isPoolingEnabled());
    }

    @Test
    public void isEmptyTest() {
        DataFrame df = new DataFrame("Test");
        assertTrue(df.isEmpty());
        df.addRow();
        assertFalse(df.isEmpty());
    }

    @Test
    public void isFlaggedTest() {
        DataFrame df = new DataFrame("Test");
        df.addRow();
        assertFalse(df.isFlagged(0));
        df.setFlag(0);
        assertTrue(df.isFlagged(0));
    }

    @Test
    public void isNotEmptyTest() {
        DataFrame df = new DataFrame("Test");
        assertFalse(df.isNotEmpty());
        df.addRow();
        assertTrue(df.isNotEmpty());
    }

}