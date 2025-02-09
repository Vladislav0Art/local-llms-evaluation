package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnStored;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import io.github.vmzakharov.ecdataframe.util.ExpressionParserHelper;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void addStringColumnNewColumnNameTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("newColumn");
        Assert.assertEquals("newColumn", dataFrame.getColumnNamed("newColumn").getName());
    }

    @Test
    public void addLongColumnNewColumnNameTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addLongColumn("newColumn");
        Assert.assertEquals("newColumn", dataFrame.getColumnNamed("newColumn").getName());
    }

    @Test
    public void addDoubleColumnNewColumnNameTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addDoubleColumn("newColumn");
        Assert.assertEquals("newColumn", dataFrame.getColumnNamed("newColumn").getName());
    }

    @Test
    public void rowCountNewDataFrameTest() {
        DataFrame dataFrame = new DataFrame("test");
        Assert.assertEquals(0, dataFrame.rowCount());
    }

    @Test
    public void addRowArgsTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("col1");
        dataFrame.addRow("test1");
        Assert.assertEquals("test1", dataFrame.getString("col1", 0));
    }

    @Test
    public void getNameTest() {
        DataFrame dataFrame = new DataFrame("test");
        Assert.assertEquals("test", dataFrame.getName());
    }

    @Test
    public void addColumnNewColumnNameValueTypeTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addColumn("newColumn", ValueType.STRING);
        Assert.assertEquals("newColumn", dataFrame.getColumnNamed("newColumn").getName());
    }

    @Test
    public void hasColumnExistingColumnTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("existing");
        Assert.assertTrue(dataFrame.hasColumn("existing"));
    }

    @Test
    public void hasColumnNotExistingColumnTest() {
        DataFrame dataFrame = new DataFrame("test");
        Assert.assertFalse(dataFrame.hasColumn("notExisting"));
    }

    @Test
    public void getEvalContextTest() {
        DataFrame dataFrame = new DataFrame("test");
        Assert.assertNotNull(dataFrame.getEvalContext());
    }

    @Test
    public void externalEvalContextTest() {
        DataFrame dataFrame = new DataFrame("test");
        ExpressionParserHelper mock = Mockito.mock(ExpressionParserHelper.class);
        dataFrame.setExternalEvalContext(mock);
        Assert.assertEquals(mock, dataFrame.getEvalContext());
    }

    @Test
    public void cloneStructureTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("col1");
        DataFrame clonedDataFrame = dataFrame.cloneStructure("cloned");
        Assert.assertNotEquals(dataFrame, clonedDataFrame);
        Assert.assertEquals(Lists.immutable.of("col1"), clonedDataFrame.getColumnNames());
    }

    @Test
    public void sealTest() {
        DataFrame dataFrame = new DataFrame("test");
        Assert.assertEquals(dataFrame, dataFrame.seal());
    }

    @Test
    public void isEmptyTrueTest() {
        DataFrame dataFrame = new DataFrame("test");
        Assert.assertTrue(dataFrame.isEmpty());
    }

    @Test
    public void isEmptyFalseTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("col1");
        dataFrame.addRow("test1");
        Assert.assertFalse(dataFrame.isEmpty());
    }

    @Test
    public void isNotEmptyTest() {
        DataFrame dataFrame = new DataFrame("test");
        Assert.assertFalse(dataFrame.isNotEmpty());
    }

    @Test
    public void columnCountTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("col1").addLongColumn("col2");
        Assert.assertEquals(2, dataFrame.columnCount());
    }

}