package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.primitive.DoubleLists;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class GeneratedTest {

    @Test
    public void DataFrameConstructorTest() {
        DataFrame dataFrame = new DataFrame("test");
        Assert.assertEquals("test", dataFrame.getName());
    }

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Column");
        List<DfColumn> columns = dataFrame.getColumns().toList();
        Assert.assertEquals(1, columns.size());
        Assert.assertEquals("Column", columns.get(0).getName());
        Assert.assertEquals(ValueType.STRING, columns.get(0).getType());
    }

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addLongColumn("Column", LongLists.mutable.with(1L, 2L, 3L));
        Assert.assertTrue(dataFrame.hasColumn("Column"));
        Assert.assertEquals(1, dataFrame.getLong("Column", 0));
        Assert.assertEquals(2, dataFrame.getLong("Column", 1));
        Assert.assertEquals(3, dataFrame.getLong("Column", 2));
    }

    @Test
    public void addDoubleColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addDoubleColumn("Column", DoubleLists.mutable.with(1.1, 2.2, 3.3));
        Assert.assertTrue(dataFrame.hasColumn("Column"));
        Assert.assertEquals(1.1, dataFrame.getDouble("Column", 0), 0.01);
        Assert.assertEquals(2.2, dataFrame.getDouble("Column", 1), 0.01);
        Assert.assertEquals(3.3, dataFrame.getDouble("Column", 2), 0.01);
    }

    @Test
    public void addDateColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addDateColumn("Column", FastList.newListWith(LocalDate.now()));
        Assert.assertTrue(dataFrame.hasColumn("Column"));
        Assert.assertEquals(LocalDate.now(), dataFrame.getDate("Column", 0));
    }

    @Test
    public void addDecimalColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addDecimalColumn("Column");
        Assert.assertTrue(dataFrame.hasColumn("Column"));
    }

    @Test
    public void addRowTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addRow();
        Assert.assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void getNameTest() {
        DataFrame dataFrame = new DataFrame("Test");
        Assert.assertEquals("Test", dataFrame.getName());
    }

    @Test
    public void rowCountTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addRow();
        Assert.assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void columnCountTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("TestColumn1");
        dataFrame.addStringColumn("TestColumn2");
        Assert.assertEquals(2, dataFrame.columnCount());
    }

    @Test
    public void getColumnNamedTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Column");
        Assert.assertNotNull(dataFrame.getColumnNamed("Column"));
    }

    @Test
    public void getColumnAtTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Column");
        Assert.assertNotNull(dataFrame.getColumnAt(0));
    }

    @Test
    public void hasColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Name");
        Assert.assertTrue(dataFrame.hasColumn("Name"));
    }

    @Test
    public void addColumnTwiceThrowExceptionTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Test");
        dataFrame.addStringColumn("Test");
    }

    @Test
    public void dropColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Test");
        dataFrame.dropColumn("Test");
        Assert.assertFalse(dataFrame.hasColumn("Test"));
    }

    @Test
    public void isEmptyTest() {
        DataFrame dataFrame = new DataFrame("Test");
        Assert.assertTrue(dataFrame.isEmpty());
    }

    @Test
    public void isNotEmptyTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addRow();
        Assert.assertTrue(dataFrame.isNotEmpty());
    }

}