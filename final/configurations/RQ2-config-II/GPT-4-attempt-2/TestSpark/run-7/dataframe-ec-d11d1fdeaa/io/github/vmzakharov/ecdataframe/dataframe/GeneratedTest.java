package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DfDoubleColumn;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.impl.factory.Sets;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Column1");
        assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void addLongColumnTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("Column1");
        assertEquals(1, df.columnCount());
    }

    @Test
    public void addDoubleColumnTest() {
        DataFrame df = new DataFrame("Test");
        df.addDoubleColumn("Column1");
        assertEquals(1, df.columnCount());
    }

    @Test
    public void addDateColumnTest() {
        DataFrame df = new DataFrame("Test");
        df.addDateColumn("Column1");
        assertEquals(1, df.columnCount());
    }

    @Test
    public void getColumnNamedTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("Column1");
        DfColumn column = df.getColumnNamed("Column1");
        assertEquals("Column1", column.getName());
    }

    @Test
    public void getColumnAtTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("Column1");
        DfColumn column = df.getColumnAt(0);
        assertEquals("Column1", column.getName());
    }

    @Test
    public void getColumnsTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("Col1").addStringColumn("Col2").addDateColumn("Col3");
        ImmutableList<DfColumn> columns = df.getColumns();
        assertEquals(Sets.immutable.of("Col1", "Col2", "Col3").castToSet(), columns.collect(DfColumn::getName).toSet());
    }

    @Test
    public void addRowTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("Column1");
        long value = 42L;
        df.addRow(FastList.newListWith(new DfLongColumn(value)));
        assertEquals(1, df.rowCount());
    }

    @Test
    public void columnNameTest() {
        DataFrame df = new DataFrame("Test");
        assertEquals("Test", df.getName());
    }

    @Test
    public void enablePoolingTest() {
        DataFrame df = new DataFrame("Test");
        df.enablePooling();
        assertTrue(df.isPoolingEnabled());
    }

    @Test
    public void sortByTest() {
        DataFrame df = new DataFrame("Test");
        df.addDoubleColumn("Score").addDateColumn("Date");
        df.addRow(1.0, LocalDate.now()).addRow(2.0, LocalDate.now());
        df.sortBy(FastList.newListWith("Score"), FastList.newListWith(DfColumnSortOrder.DESC));
        assertEquals(2.0, df.getDouble("Score", 0), 0.001);
    }

}