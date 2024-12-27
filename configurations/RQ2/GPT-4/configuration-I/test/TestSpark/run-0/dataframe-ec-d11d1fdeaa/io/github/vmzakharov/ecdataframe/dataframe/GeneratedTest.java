package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void DataFrameNewNameTest() {
        DataFrame df = new DataFrame("testing");
        assertEquals("testing", df.getName());
    }

    @Test
    public void addStringColumnNewColumnNameTest() {
        DataFrame df = new DataFrame("testing");
        df.addStringColumn("column1");
        assertTrue(df.hasColumn("column1"));
    }

    @Test
    public void addLongColumnNewColumnNameTest() {
        DataFrame df = new DataFrame("testing");
        df.addLongColumn("column1");
        assertTrue(df.hasColumn("column1"));
    }

    @Test
    public void addDoubleColumnNewColumnNameTest() {
        DataFrame df = new DataFrame("testing");
        df.addDoubleColumn("column1");
        assertTrue(df.hasColumn("column1"));
    }

    @Test
    public void addDateColumnNewColumnNameTest() {
        DataFrame df = new DataFrame("testing");
        df.addDateColumn("column1");
        assertTrue(df.hasColumn("column1"));
    }

    @Test
    public void addRowObjectValuesTest() {
        DataFrame df = new DataFrame("testing");
        df.addStringColumn("column1");
        df.addRow("value1");
        assertEquals("value1", df.getString("column1", 0));
    }

    @Test
    public void columnCountTest() {
        DataFrame df = new DataFrame("testing");
        df.addStringColumn("column1");
        df.addStringColumn("column2");
        assertEquals(2, df.columnCount());
    }

    @Test
    public void sealTest() {
        DataFrame df = new DataFrame("testing");
        df.addStringColumn("column1");
        df.seal();
        //Here you should check whether DataFrame's status has changed to sealed.
    }

    @Test
    public void dropColumnTest() {
        DataFrame df = new DataFrame("testing");
        df.addStringColumn("column1");
        df.dropColumn("column1");
        assertFalse(df.hasColumn("column1"));
    }

    @Test
    public void isEmptyTest() {
        DataFrame df = new DataFrame("testing");
        assertTrue(df.isEmpty());
    }

    @Test
    public void isNotEmptyTest() {
        DataFrame df = new DataFrame("testing");
        df.addStringColumn("column1");
        df.addRow("value1");
        assertTrue(df.isNotEmpty());
    }

}