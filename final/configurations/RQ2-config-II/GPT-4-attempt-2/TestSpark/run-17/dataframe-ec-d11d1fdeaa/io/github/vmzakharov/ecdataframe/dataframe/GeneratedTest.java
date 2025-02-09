package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DfStringColumn;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addStringColumnTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addStringColumn("TestColumn");
        DfColumn column = df.getColumnNamed("TestColumn");
        assertNotNull(column);
        assertTrue(column instanceof DfStringColumn);
    }

    @Test
    public void addLongColumnTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addLongColumn("TestColumn", LongLists.mutable.of(1L, 2L, 3L));
        DfColumn column = df.getColumnNamed("TestColumn");
        assertEquals(df.getLong("TestColumn", 0), 1L);
    }

    @Test
    public void getColumnNamedTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addStringColumn("TestColumn");
        DfColumn column = df.getColumnNamed("TestColumn");
        assertEquals(column.getName(), "TestColumn");
    }

    @Test
    public void getColumnsTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addStringColumn("TestColumn1");
        df.addStringColumn("TestColumn2");
        assertEquals(df.getColumns().size(), 2);
    }

    @Test
    public void rowCountTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addLongColumn("TestColumn", LongLists.mutable.of(1L, 2L, 3L));
        assertEquals(df.rowCount(), 3);
    }

    @Test
    public void columnCountTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addLongColumn("TestColumn", LongLists.mutable.of(1L, 2L, 3L));
        df.addStringColumn("TestColumn2");
        assertEquals(df.columnCount(), 2);
    }

    @Test
    public void getNameTest() {
        DataFrame df = new DataFrame("TestFrame");
        assertEquals(df.getName(), "TestFrame");
    }

    @Test
    public void addColumnTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addColumn("TestColumn", ValueType.STRING);
        DfColumn column = df.getColumnNamed("TestColumn");
        assertEquals(column.getValueType(), ValueType.STRING);
    }

    @Test
    public void addColumnExpressionTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addColumn("TestColumn", ValueType.STRING, "'test'");
        DfColumn column = df.getColumnNamed("TestColumn");
        assertEquals(df.getValue("TestColumn", 0).asString(), "test");
    }

    @Test
    public void sortByTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addLongColumn("TestColumn", LongLists.mutable.of(3L, 1L, 2L));
        df.sortBy(Lists.mutable.of("TestColumn"), Lists.mutable.of(DfColumnSortOrder.ASC));
        assertEquals(df.getLong("TestColumn", 0), 1L);
    }

    @Test
    public void isEmptyTest() {
        DataFrame df = new DataFrame("TestFrame");
        assertTrue(df.isEmpty());
    }

    @Test
    public void enablePoolingTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.enablePooling();
        assertTrue(dataFrame.isPoolingEnabled());
    }

}