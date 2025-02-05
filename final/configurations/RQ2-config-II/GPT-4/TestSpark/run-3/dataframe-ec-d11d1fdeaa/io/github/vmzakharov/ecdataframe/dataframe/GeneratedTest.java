package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumns;
import io.github.vmzakharov.ecdataframe.dataframe.DfDecimalColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfDoubleColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfLongColumn;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("Test Dataframe");
        dataFrame.addStringColumn("String Column");
        Assert.assertTrue(dataFrame.hasColumn("String Column"));
    }

    @Test
    public void addStringColumnWithExpressionTest() {
        DataFrame dataFrame = new DataFrame("Test Dataframe");
        dataFrame.addStringColumn("String Column", "Test Expression");
        Assert.assertTrue(dataFrame.hasColumn("String Column"));
        Assert.assertTrue(dataFrame.getColumns().contains(dataFrame.getColumnNamed("String Column")));
    }

    @Test
    public void addStringColumnWithValuesTest() {
        DataFrame dataFrame = new DataFrame("Test Dataframe");
        dataFrame.addStringColumn("String Column", new ArrayList<String>(Arrays.asList("value1", "value2")));
        Assert.assertEquals(2, dataFrame.rowCount());
    }

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("Test Dataframe");
        dataFrame.addLongColumn("Long Column");
        DfLongColumn dfLongColumn = dataFrame.getLongColumn("Long Column");
        Assert.assertNotNull(dfLongColumn);
    }

    @Test
    public void addLongColumnWithValuesTest() {
        DataFrame dataFrame = new DataFrame("Test Dataframe");
        dataFrame.addLongColumn("Long Column", new ArrayList<Long>(Arrays.asList(1L, 2L, 3L)));
        Assert.assertEquals(3, dataFrame.rowCount());
    }

    @Test
    public void addRowTest() {
        DataFrame dataFrame = new DataFrame("Test Dataframe");
        dataFrame.addStringColumn("Column1");
        dataFrame.addStringColumn("Column2");
        Assert.assertEquals(0, dataFrame.rowCount());
        dataFrame.addRow();
        Assert.assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void addRowWithValuesTest() {
        DataFrame dataFrame = new DataFrame("Test Dataframe");
        dataFrame.addStringColumn("Column1");
        dataFrame.addStringColumn("Column2");
        Assert.assertEquals(0, dataFrame.rowCount());
        dataFrame.addRow("Test Cell 1", "Test Cell 2");
        Assert.assertEquals("Test Cell 1", dataFrame.getValueAsString(0, 0));
        Assert.assertEquals("Test Cell 2", dataFrame.getValueAsString(0, 1));
    }

    @Test
    public void getColumnAtTest() {
        DataFrame dataFrame = new DataFrame("Test Dataframe");
        dataFrame.addStringColumn("Column1");
        dataFrame.addStringColumn("Column2");
        Assert.assertEquals("Column1", dataFrame.getColumnAt(0).getName());
    }

}