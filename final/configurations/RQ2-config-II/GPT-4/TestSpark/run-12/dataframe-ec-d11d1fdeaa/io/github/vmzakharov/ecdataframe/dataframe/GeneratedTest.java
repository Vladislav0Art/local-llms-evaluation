package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnStored;
import io.github.vmzakharov.ecdataframe.dsl.value.BooleanValue;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.mockito.Mockito;
import org.eclipse.collections.impl.factory.primitive.IntLists;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneratedTest {

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("DataFrameTest");
        dataFrame.addStringColumn("TestColumn");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("DataFrameTest");
        dataFrame.addLongColumn("TestColumn");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void addDoubleColumnTest() {
        DataFrame dataFrame = new DataFrame("DataFrameTest");
        dataFrame.addDoubleColumn("TestColumn");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void addDateColumnTest() {
        DataFrame dataFrame = new DataFrame("DataFrameTest");
        dataFrame.addDateColumn("TestColumn");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void addDateTimeColumnTest() {
        DataFrame dataFrame = new DataFrame("DataFrameTest");
        dataFrame.addDateTimeColumn("TestColumn");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void addDecimalColumnTest() {
        DataFrame dataFrame = new DataFrame("DataFrameTest");
        dataFrame.addDecimalColumn("TestColumn");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void getAggregateIndexTest() {
        DataFrame dataFrame = new DataFrame("DataFrameTest");
        Assert.assertEquals(IntLists.mutable.empty().castToIntList(), dataFrame.getAggregateIndex(1));
    }

    @Test
    public void hasColumnTest() {
        DataFrame dataFrame = new DataFrame("DataFrameTest");
        dataFrame.addStringColumn("TestColumn");
        Assert.assertTrue(dataFrame.hasColumn("TestColumn"));
    }

    @Test
    public void getValueWithoutColumnsTest() {
        DataFrame dataFrame = new DataFrame("DataFrameTest");
        dataFrame.getValue(0, 0);
    }

    @Test
    public void columnCountTest() {
        DataFrame dataFrame = new DataFrame("DataFrameTest");
        dataFrame.addStringColumn("TestColumn1");
        dataFrame.addStringColumn("TestColumn2");
        Assert.assertEquals(2, dataFrame.columnCount());
    }

    @Test
    public void rowCountTest() {
        DataFrame dataFrame = new DataFrame("DataFrameTest");
        MutableList<Value> values = Lists.mutable.of(BooleanValue.valueOf(true));
        dataFrame.addRow(values);
        Assert.assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void addRowTest() {
        DataFrame dataFrame = new DataFrame("DataFrameTest");
        MutableList<Value> values = Lists.mutable.of(BooleanValue.valueOf(true));
        dataFrame.addRow(values);
        Assert.assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void createComputedColumnTest() {
        DataFrame dataFrame = new DataFrame("DataFrameTest");
        Assert.assertNotNull(dataFrame.createComputedColumn("test", ValueType.STRING, "dummy"));
    }

    @Test
    public void getObjectTest() {
        DataFrame dataFrame = new DataFrame("DataFrameTest");
        MutableList<Value> values = Lists.mutable.of(BooleanValue.valueOf(true));
        dataFrame.addRow(values);
        Assert.assertFalse((boolean) dataFrame.getObject(0, 0));
    }

}