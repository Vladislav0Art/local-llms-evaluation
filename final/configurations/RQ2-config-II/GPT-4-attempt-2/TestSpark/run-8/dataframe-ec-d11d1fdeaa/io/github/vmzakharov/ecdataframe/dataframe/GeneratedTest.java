package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfDoubleColumn;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        DataFrame df = new DataFrame("testFrame");
        Assert.assertEquals("testFrame", df.getName());
    }

    @Test
    public void addStringColumnTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addStringColumn("column1");
        Assert.assertTrue(df.hasColumn("column1"));
    }

    @Test
    public void addLongColumnTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addLongColumn("column1");
        Assert.assertTrue(df.hasColumn("column1"));
    }

    @Test
    public void getColumnNamedTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addDoubleColumn("column1");
        DfColumn column = df.getColumnNamed("column1");
        Assert.assertEquals("column1", column.getName());
    }

    @Test
    public void isFlaggedTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addRow();
        df.setFlag(0);
        Assert.assertTrue(df.isFlagged(0));
    }

    @Test
    public void addRowTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addDoubleColumn("column1");
        df.addRow(Lists.mutable.of(ValueType.DOUBLE.newValue(4.3)));
        Assert.assertEquals(4.3, df.getDouble("column1", 0), 0.01);
    }

    @Test
    public void addColumnNewValueTypeTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addColumn("column1", ValueType.DOUBLE);
        Assert.assertTrue(df.hasColumn("column1"));
    }

    @Test
    public void createComputedColumnTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addDoubleColumn("column1", Lists.mutable.of(4.3, 5.5, 6.7));
        df.addDoubleColumn("column2", Lists.mutable.of(3.0, 4.0, 5.0));
        df.createComputedColumn("column3", ValueType.DOUBLE, "column1 + column2");
        Assert.assertEquals(7.3, df.getDouble("column3", 0), 0.01);
        Assert.assertEquals(9.5, df.getDouble("column3", 1), 0.01);
        Assert.assertEquals(11.7, df.getDouble("column3", 2), 0.01);
    }

    @Test
    public void addDateColumnValueTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addDateColumn("column1", Arrays.asList(LocalDate.of(2020, 5, 20),
                LocalDate.of(2021, 6, 5)));
        Assert.assertEquals(LocalDate.of(2020, 5, 20), df.getDate("column1", 0));
    }

    @Test
    public void getDoubleTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addDoubleColumn("column1", Arrays.asList(135.5d, 124.5d, 189.2d));
        double value = df.getDouble("column1", 1);
        Assert.assertEquals(124.5d, value, 0);
    }

    @Test
    public void getDateTimeTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addDateTimeColumn("column1", Arrays.asList(
                LocalDateTime.of(2021, 8, 5, 13, 15),
                LocalDateTime.of(2021, 9, 3, 14, 15)));
        LocalDateTime dateTime = df.getDateTime("column1", 0);
        Assert.assertEquals(LocalDateTime.of(2021, 8, 5, 13, 15), dateTime);
    }

    @Test
    public void dropColumnsTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addStringColumn("column1");
        df.addStringColumn("column2");
        df.dropColumns(Lists.mutable.of("column1"));
        Assert.assertFalse(df.hasColumn("column1"));
        Assert.assertTrue(df.hasColumn("column2"));
    }

}