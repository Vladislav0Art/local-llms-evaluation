package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.eclipse.collections.api.list.primitive.MutableBooleanList;
import org.eclipse.collections.impl.factory.primitive.BooleanLists;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void DataFrameCreationTest() {
        DataFrame dataFrame = new DataFrame("TestName");
        Assert.assertEquals("TestName", dataFrame.getName());
    }

    @Test
    public void addRowTest() {
        DataFrame dataFrame = new DataFrame("TestName");
        dataFrame.addStringColumn("Column1");
        dataFrame.addRow(new StringValue("Test"));
        Assert.assertEquals("Test", dataFrame.getObject("Column1", 0));
    }

    @Test
    public void rowCountTest() {
        DataFrame dataFrame = new DataFrame("TestName");
        dataFrame.addStringColumn("Column1");
        dataFrame.addRow(new StringValue("Test1"));
        dataFrame.addRow(new StringValue("Test2"));
        Assert.assertEquals(2, dataFrame.rowCount());
    }

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("TestName");
        dataFrame.addStringColumn("testColumn", Lists.mutable.with("AAA", "BBB", "CCC"));
        Assert.assertEquals(3, dataFrame.rowCount());
    }

    @Test
    public void addDateColumnTest() {
        DataFrame dataFrame = new DataFrame("TestName");
        dataFrame.addDateColumn("testColumn", Lists.mutable.with(LocalDate.now(), LocalDate.of(2018, 10, 10)));
        Assert.assertEquals(LocalDate.now(), dataFrame.getDate("testColumn", 0));
    }

    @Test
    public void distinctTest() {
        DataFrame dataFrame = new DataFrame("TestName");
        dataFrame.addStringColumn("Column1");
        dataFrame.addRow(new StringValue("Test"));
        dataFrame.addRow(new StringValue("Test"));
        Assert.assertEquals(1, dataFrame.distinct().rowCount());
    }

    @Test
    public void joinTest() {
        DataFrame dataFrame1 = new DataFrame("TestName1");
        dataFrame1.addStringColumn("Column1");
        dataFrame1.addRow(new StringValue("XYZ"));

        DataFrame dataFrame2 = new DataFrame("TestName2");
        dataFrame2.addStringColumn("Column1");
        dataFrame2.addRow(new StringValue("XYZ"));

        DataFrame joinedDataFrame = dataFrame1.join(dataFrame2, "Column1", "Column1");

        Assert.assertEquals(2, joinedDataFrame.columnCount());
    }

    @Test
    public void isEmptyTest() {
        DataFrame dataFrame = new DataFrame("TestName");
        Assert.assertTrue(dataFrame.isEmpty());
    }

    @Test
    public void isNotEmptyTest() {
        DataFrame dataFrame = new DataFrame("TestName");
        dataFrame.addStringColumn("Column1");
        dataFrame.addRow(new StringValue("Test"));
        Assert.assertTrue(dataFrame.isNotEmpty());
    }

}