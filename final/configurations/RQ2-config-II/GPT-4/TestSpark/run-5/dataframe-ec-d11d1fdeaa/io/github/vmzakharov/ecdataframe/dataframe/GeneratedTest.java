package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Maps;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void addStringColumnTest() {
        String newColumnName = "TestColumn";
        DataFrame df = new DataFrame("TestFrame");
        df.addStringColumn(newColumnName);
        Assert.assertEquals(newColumnName, df.getColumnNamed(newColumnName).getName());
    }

    @Test
    public void addLongColumnNewColumnNameTest() {
        DataFrame df = new DataFrame("TestFrame");
        String newColumnName = "TestLongColumn";
        df.addLongColumn(newColumnName);
        Assert.assertEquals(newColumnName, df.getColumnNamed(newColumnName).getName());
    }

    @Test
    public void addLongColumnWithExpressionTest() {
        DataFrame df = new DataFrame("TestFrame");
        String newColumnName = "TestLongColumn";
        String expressionAsString = "1+1";
        df.addLongColumn(newColumnName, expressionAsString);
        Assert.assertEquals(newColumnName, df.getColumnNamed(newColumnName).getName());
    }

    @Test
    public void addLongColumnWithIterableTest() {
        DataFrame df = new DataFrame("TestFrame");
        String newColumnName = "TestLongColumn";
        df.addLongColumn(newColumnName, LongLists.mutable.of(1L, 2L, 3L));
        Assert.assertEquals(newColumnName, df.getColumnNamed(newColumnName).getName());
    }

    @Test
    public void addColumnTest() {
        DataFrame df = new DataFrame("TestFrame");
        Assert.assertEquals(0, df.columnCount());
        df.addColumn("TestColumnName", "STRING");
        Assert.assertEquals(1, df.columnCount());
    }

    @Test
    public void addRowTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addRow(Lists.mutable.of(1, 2, 3, 4, 5));
        Assert.assertEquals(1, df.rowCount());
    }

    @Test
    public void getColumnAtTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addColumn("TestColumnName", "STRING");
        Assert.assertNotNull(df.getColumnAt(0));
    }

    @Test
    public void sortByTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addLongColumn("TestColumnName", LongLists.mutable.of(3L, 2L, 1L));
        df.sortBy(Lists.mutable.of("TestColumnName"), Lists.mutable.of(DfColumnSortOrder.ASC));
        Assert.assertEquals(1L, df.getLong("TestColumnName", 0));
    }

    @Test
    public void columnComparatorTest() {
        DataFrame df1 = new DataFrame("TestFrame1");
        df1.addLongColumn("TestColumnName", LongLists.mutable.of(3L, 2L, 1L));
        DataFrame df2 = new DataFrame("TestFrame2");
        df2.addLongColumn("TestColumnName", LongLists.mutable.of(3L, 2L, 1L));
        Assert.assertEquals(0, df1.columnComparator(df2, "TestColumnName", "TestColumnName").compare(0, 0));
    }

    @Test
    public void joinTest() {
        DataFrame df1 = new DataFrame("TestFrame1");
        df1.addLongColumn("TestColumnName", LongLists.mutable.of(1L, 2L, 3L));
        DataFrame df2 = new DataFrame("TestFrame2");
        df2.addLongColumn("TestColumnName", LongLists.mutable.of(3L, 4L, 5L));
        DataFrame joinedDataFrame = df1.join(df2, Lists.mutable.of("TestColumnName"), Lists.mutable.of("TestColumnName"));
        Assert.assertEquals(1, joinedDataFrame.rowCount());
    }

    @Test
    public void joinWithNonExistentColumnNameTest() {
        DataFrame df1 = new DataFrame("TestFrame1");
        df1.addLongColumn("TestColumnName", LongLists.mutable.of(1L, 2L, 3L));
        DataFrame df2 = new DataFrame("TestFrame2");
        df2.addLongColumn("TestColumnName", LongLists.mutable.of(3L, 4L, 5L));
        df1.join(df2, Lists.mutable.of("NonExistentColumnName"), Lists.mutable.of("TestColumnName"));
    }

    @Test
    public void dropColumnTest() {
        DataFrame df = new DataFrame("TestFrame");
        String newColumnName = "TestColumn";
        df.addStringColumn(newColumnName);
        Assert.assertEquals(newColumnName, df.getColumnNamed(newColumnName).getName());
        df.dropColumn(newColumnName);
        Assert.assertEquals(null, df.getColumnNamed(newColumnName));
    }

    @Test
    public void copyTest() {
        DataFrame df1 = new DataFrame("TestFrame1");
        df1.addStringColumn("TestColumn", Lists.mutable.of("1", "2", "3"));
        DataFrame df2 = df1.copy("TestFrame2");
        Assert.assertEquals(df1.getName(), "TestFrame1");
        Assert.assertEquals(df2.getName(), "TestFrame2");
    }

    @Test
    public void evaluateExpressionTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addStringColumn("TestColumn", Lists.mutable.of("1", "2", "3"));
        Expression expression = mock(Expression.class);
        Assert.assertEquals(null, df.evaluateExpression(expression, 0));
    }

}