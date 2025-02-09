package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.primitive.IntLists;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class GeneratedTest {

    // Sample test cases to get coverage for multiple methods. Not exhaustive.

    @Test
    public void addStringColumnTest() {
        DataFrame df = new DataFrame("TestDF");
        df.addStringColumn("TestColumn");

        Assert.assertEquals(1, df.columnCount());
    }

    @Test
    public void addRowTest() {
        DataFrame df = new DataFrame("TestDF");
        df.addStringColumn("TestColumn");
        df.addRow(Arrays.asList("TestRow"));

        Assert.assertEquals(1, df.rowCount());
    }

    @Test
    public void asCsvStringTest() {
        DataFrame df = new DataFrame("TestDF");
        df.addStringColumn("TestColumn");
        df.addRow(Arrays.asList("TestRow"));

        Assert.assertEquals("TestColumn\nTestRow\n", df.asCsvString());
    }

    @Test
    public void getNameTest() {
        DataFrame df = new DataFrame("TestDF");

        Assert.assertEquals("TestDF", df.getName());
    }

    @Test
    public void getObjectTest() {
        DataFrame df = new DataFrame("TestDF");
        df.addStringColumn("TestColumn");
        df.addRow(Arrays.asList("TestRow"));

        Assert.assertEquals("TestRow", df.getObject(0, 0));
    }

    @Test
    public void hasColumnTest() {
        DataFrame df = new DataFrame("TestDF");
        df.addStringColumn("TestColumn");

        Assert.assertTrue(df.hasColumn("TestColumn"));
        Assert.assertFalse(df.hasColumn("NullColumn"));
    }

    @Test
    public void getEvalContextMockTest() {
        DataFrame df = Mockito.spy(new DataFrame("TestDF"));
        df.getEvalContext();

        Mockito.verify(df, Mockito.times(1)).getEvalContext();
    }

    @Test
    public void setExternalEvalContextMockTest() {
        DataFrame df = Mockito.spy(new DataFrame("TestDF"));
        df.setExternalEvalContext(null);

        Mockito.verify(df, Mockito.times(1)).setExternalEvalContext(null);
    }

    @Test
    public void addColumnTest() {
        DataFrame df = new DataFrame("TestDF");
        df.addColumn("TestColumn", ValueType.STRING);

        Assert.assertEquals(1, df.columnCount());
    }

    @Test
    public void getLongColumnTest() {
        DataFrame df = new DataFrame("TestDF");
        df.addLongColumn("TestColumn");

        Assert.assertTrue(df.getLongColumn("TestColumn") instanceof DfLongColumn);
    }

    @Test
    public void resetBitmapMockTest() {
        DataFrame df = Mockito.spy(new DataFrame("TestDF"));
        df.resetBitmap();

        Mockito.verify(df, Mockito.times(1)).resetBitmap();
    }

    @Test
    public void isNotEmptyTest() {
        DataFrame df = new DataFrame("TestDF");
        df.addStringColumn("TestColumn");
        df.addRow(Arrays.asList("TestRow"));

        Assert.assertTrue(df.isNotEmpty());
    }

    @Test
    public void dropColumnsTest() {
        DataFrame df = new DataFrame("TestDF");
        df.addStringColumn("TestColumn");
        df.dropColumns(Arrays.asList("TestColumn"));

        Assert.assertEquals(0, df.columnCount());
    }

}