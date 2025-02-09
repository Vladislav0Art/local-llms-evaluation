package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DfCursor;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import io.github.vmzakharov.ecdataframe.util.ExpressionParserHelper;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Predicate;

public class GeneratedTest {

    @Test
    public void addStringColumnTest() {
        DataFrame df = new DataFrame("demo");
        df.addStringColumn("Column1");
        Assert.assertEquals("Column1", df.getColumns().getFirst().getName());
    }

    @Test
    public void addLongColumnTest() {
        DataFrame df = new DataFrame("demo");
        df.addLongColumn("Column1");
        Assert.assertEquals("Column1", df.getColumns().getFirst().getName());
    }

    @Test
    public void addDoubleColumnTest() {
        DataFrame df = new DataFrame("demo");
        df.addDoubleColumn("Column1");
        Assert.assertEquals("Column1", df.getColumns().getFirst().getName());
    }

    @Test
    public void addDateColumnTest() {
        DataFrame df = new DataFrame("demo");
        df.addDateColumn("Column1");
        Assert.assertEquals("Column1", df.getColumns().getFirst().getName());
    }

    @Test
    public void addDateTimeColumnTest() {
        DataFrame df = new DataFrame("demo");
        df.addDateTimeColumn("Column1");
        Assert.assertEquals("Column1", df.getColumns().getFirst().getName());
    }

    @Test
    public void rowCountTest() {
        DataFrame df = new DataFrame("demo");
        df.addStringColumn("Column1", FastList.newListWith("A", "B", "C"));
        Assert.assertEquals(3, df.rowCount());
    }

    @Test
    public void columnCountTest() {
        DataFrame df = new DataFrame("demo");
        df.addStringColumn("Column1", FastList.newListWith("A", "B", "C"));
        df.addStringColumn("Column2", FastList.newListWith("A", "B", "C"));
        Assert.assertEquals(2, df.columnCount());
    }

    @Test
    public void evaluateExpressionTest() {
        DataFrame df = new DataFrame("demo");
        df.addStringColumn("Column1", FastList.newListWith("A", "B", "C"));
        df.addLongColumn("Column2", FastList.newListWith(1L, 2L, 3L));
        Assert.assertEquals(3L, df.evaluateExpression(ExpressionParserHelper.createExpression("return Column2"), 2).longValue());
    }

    @Test
    public void unionTest() {
        DataFrame df1 = new DataFrame("df1").addStringColumn("Column1", Lists.mutable.of("A", "B", "C"));
        DataFrame df2 = new DataFrame("df2").addStringColumn("Column1", Lists.mutable.of("D", "E", "F"));

        DataFrame unionDf = df1.union(df2);

        Assert.assertEquals(6, unionDf.rowCount());
    }

    @Test
    public void joinTest() {
        DataFrame df1 = new DataFrame("df1").addStringColumn("Column1", Lists.mutable.of("A", "B", "C")).addLongColumn("Column2", Lists.mutable.of(1L, 2L, 3L));
        DataFrame df2 = new DataFrame("df2").addStringColumn("Column1", Lists.mutable.of("A", "B", "C")).addDoubleColumn("Column3", Lists.mutable.of(1.0, 2.0, 3.0));

        DataFrame joinDf = df1.join(df2, Lists.mutable.of("Column1"), Lists.mutable.of("Column1"));

        Assert.assertEquals(3, joinDf.rowCount());
        Assert.assertEquals(3, joinDf.columnCount());
    }

    @Test
    public void sortByExpressionTest() {
        DataFrame df = new DataFrame("demo");
        df.addStringColumn("Column1", FastList.newListWith("B", "A", "C"));
        df = df.sortByExpression("Column1", DfColumnSortOrder.ASC);
        Assert.assertEquals("A", df.getObject("Column1", 0));
    }

}